package com.example.theatercoursework.service.request.impls;

import com.example.theatercoursework.model.*;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.repository.employee.EmployeeRepository;
import com.example.theatercoursework.repository.ticket.TicketRepository;
import com.example.theatercoursework.repository.touring.TouringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class RequestServiceImpl {

    @Autowired
    TouringRepository touringRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    EmployeeRepository employeeRepository;


    public Set<Actor> getAllActorsWhoWasInTouring() {
        Set<Actor> mainRoles = touringRepository.findAll()
                                                .stream()
                                                .flatMap(item -> item.getSpectacle().getMainRoles().stream())
                                                .collect(Collectors.toSet());
        Set<Actor> understudies = touringRepository.findAll()
                                                   .stream()
                                                   .flatMap(item -> item.getSpectacle().getUnderstudies().stream())
                                                   .collect(Collectors.toSet());
        Set<Actor> secondaryRoles = touringRepository.findAll()
                                                     .stream()
                                                     .flatMap(item -> item.getSpectacle().getSecondaryRoles().stream())
                                                     .collect(Collectors.toSet());

        mainRoles.addAll(understudies);
        mainRoles.addAll(secondaryRoles);
        return mainRoles;
    }

    public Set<Producer> getAllProducersWhoWasInTouring() {
        Set<Producer> producers = new HashSet<>();
        touringRepository.findAll().stream().map(Touring::getSpectacle).forEach(item -> producers.addAll(
                Arrays.asList(item.getDirector(), item.getArtist(), item.getAuthor(), item.getConductor())));

        return producers;
    }

    public Set<Musician> getAllMusiciansWhoWasInTouring() {

        return touringRepository.findAll()
                                .stream()
                                .flatMap(item -> item.getSpectacle().getMusicians().stream())
                                .collect(Collectors.toSet());
    }

    public Integer getSalarySum() {
        return employeeRepository.findAll().stream().mapToInt(Employee::getSalary).sum();
    }

    public Map<EmployeeType, Integer> groupSalaryByEmployeeType() {
        return employeeRepository.findAll()
                                 .stream()
                                 .collect(Collectors.groupingBy(Employee::getEmployeeType,
                                                                Collectors.summingInt(Employee::getSalary)))
                                 .entrySet()
                                 .stream()
                                 .sorted(Map.Entry.comparingByValue())
                                 .collect(Collectors.toMap(
                                         Map.Entry::getKey,
                                         Map.Entry::getValue,
                                         (u, v) -> {
                                             throw new IllegalStateException(
                                                     String.format("Duplicate key %s", u));
                                         },
                                         LinkedHashMap::new));
    }
    public List<Employee> getEmployeeWithBirthdateAfter(LocalDate after){
        return employeeRepository.findByBirthDateAfter(after);
    }

    public List<Employee> getEmployeeWithBirthdateBefore(LocalDate before) {
        return employeeRepository.findByBirthDateBefore(before);
    }

    public List<Employee> getEmployeeWithBirthdateBetween(LocalDate after, LocalDate before) {
        return employeeRepository.findByBirthDateBetween(after, before);
    }

//    public Map<Genre, Double> groupIncomeByGenre(){
//        return ticketRepository.findAll()
//                                 .stream()
//                                 .collect(Collectors.groupingBy(item -> item.getPerformance().getSpectacle().getGenre(), 0))
//                                 .entrySet()
//                                 .stream()
//                                 .sorted(Map.Entry.comparingByValue())
//                                 .collect(Collectors.toMap(
//                                         Map.Entry::getKey,
//                                         Map.Entry::getValue,
//                                         (u, v) -> {
//                                             throw new IllegalStateException(
//                                                     String.format("Duplicate key %s", u));
//                                         },
//                                         LinkedHashMap::new));
//    }
}
