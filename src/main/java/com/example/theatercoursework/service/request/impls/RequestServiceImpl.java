package com.example.theatercoursework.service.request.impls;

import com.example.theatercoursework.model.*;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.model.enums.PlaceType;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.employee.EmployeeRepository;
import com.example.theatercoursework.repository.performance.PerformanceRepository;
import com.example.theatercoursework.repository.spectacle.SpectacleRepository;
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

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    SpectacleRepository spectacleRepository;

    @Autowired
    PerformanceRepository performanceRepository;

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

    public Map<EmployeeType, Long> groupFrequencyByEmployeeType() {
        return employeeRepository.findAll()
                                 .stream()
                                 .collect(Collectors.groupingBy(Employee::getEmployeeType,
                                                                Collectors.counting()))
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

    public List<Employee> getEmployeeWithBirthdateAfter(LocalDate after) {
        return employeeRepository.findByBirthDateAfter(after);
    }

    public List<Employee> getEmployeeWithBirthdateBefore(LocalDate before) {
        return employeeRepository.findByBirthDateBefore(before);
    }

    public List<Employee> getEmployeeWithBirthdateBetween(LocalDate after, LocalDate before) {
        return employeeRepository.findByBirthDateBetween(after, before);
    }

    public Map<Genre, Double> groupIncomeByGenre() {
        return Arrays.stream(Genre.values())
                     .collect(Collectors.toMap(key -> key, value -> ticketRepository.findAll()
                                                                                    .stream()
                                                                                    .filter(item -> value.equals(
                                                                                            item.getPerformance()
                                                                                                .getSpectacle()
                                                                                                .getGenre()))
                                                                                    .mapToDouble(Ticket::getPrice)
                                                                                    .sum()))
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

    public Map<Genre, Integer> groupFrequencyByGenre() {
        return Arrays.stream(Genre.values())
                     .collect(Collectors.toMap(key -> key, value -> ticketRepository.findAll()
                                                                                    .stream()
                                                                                    .filter(item -> value.equals(
                                                                                            item.getPerformance()
                                                                                                .getSpectacle()
                                                                                                .getGenre()))
                                                                                    .mapToInt(frequency -> 1)
                                                                                    .sum()))
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

    public Map<PlaceType, Double> groupIncomeByPlaceType() {
        return Arrays.stream(PlaceType.values())
                     .collect(Collectors.toMap(key -> key, value -> ticketRepository.findAll()
                                                                                    .stream()
                                                                                    .filter(item -> value.equals(
                                                                                            item.getPlaceType()))
                                                                                    .mapToDouble(Ticket::getPrice)
                                                                                    .sum()))
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

    public Map<PlaceType, Integer> groupFrequencyByPlaceType() {
        return Arrays.stream(PlaceType.values())
                     .collect(Collectors.toMap(key -> key, value -> ticketRepository.findAll()
                                                                                    .stream()
                                                                                    .filter(item -> value.equals(
                                                                                            item.getPlaceType()))
                                                                                    .mapToInt(frequency -> 1)
                                                                                    .sum()))
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


    public Double getIncomeBetweenDates(LocalDate after, LocalDate before) {
        return ticketRepository.findAll()
                               .stream()
                               .filter(item -> item.getPerformance().getDateAndTime().toLocalDate().isAfter(after)
                                               && item.getPerformance().getDateAndTime().toLocalDate().isBefore(before))
                               .mapToDouble(Ticket::getPrice)
                               .sum();
    }

    public Set<Actor> getActorsActingAtDate(LocalDate date) {
        Set<Actor> mainRoles = performanceRepository.findAll()
                                                    .stream()
                                                    .filter(item -> date.isEqual(item.getDateAndTime().toLocalDate()))
                                                    .flatMap(item -> item.getSpectacle().getMainRoles().stream())
                                                    .collect(Collectors.toSet());
        Set<Actor> understudies = performanceRepository.findAll()
                                                       .stream()
                                                       .filter(item -> date.isEqual(
                                                               item.getDateAndTime().toLocalDate()))
                                                       .flatMap(item -> item.getSpectacle().getUnderstudies().stream())
                                                       .collect(Collectors.toSet());
        Set<Actor> secondaryRoles = performanceRepository.findAll()
                                                         .stream()
                                                         .filter(item -> date.isEqual(
                                                                 item.getDateAndTime().toLocalDate()))
                                                         .flatMap(item -> item.getSpectacle()
                                                                              .getSecondaryRoles()
                                                                              .stream())
                                                         .collect(Collectors.toSet());

        mainRoles.addAll(understudies);
        mainRoles.addAll(secondaryRoles);
        return mainRoles;
    }
}
