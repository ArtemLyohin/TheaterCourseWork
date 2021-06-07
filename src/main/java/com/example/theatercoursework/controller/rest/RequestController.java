package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.model.Musician;
import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.model.enums.PlaceType;
import com.example.theatercoursework.service.request.impls.RequestServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Tag(name = "Request's controller", description = "Запити")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/requests")
public class RequestController {
    @Autowired
    RequestServiceImpl service;

    @Operation(
            summary = "Вивести всіх акторів, які були на гастролях",
            description = "Вивести всіх акторів, які були на гастролях"
    )
    @GetMapping("/get/actors/was-in-touring/")
    public Set<Actor> getAllActorsWhoWasInTouring() {
        return service.getAllActorsWhoWasInTouring();
    }

    @Operation(
            summary = "Вивести всіх музикантів, які були на гастролях",
            description = "Вивести всіх музикантів, які були на гастролях"
    )
    @GetMapping("/get/musicians/was-in-touring/")
    public Set<Musician> getAllMusiciansWhoWasInTouring() {
        return service.getAllMusiciansWhoWasInTouring();
    }


    @Operation(
            summary = "Вивести всіх постановників, які були на гастролях",
            description = "Вивести всіх постановників, які були на гастролях"
    )
    @GetMapping("/get/producers/was-in-touring/")
    public Set<Producer> getAllProducersWhoWasInTouring() {
        return service.getAllProducersWhoWasInTouring();
    }

    @Operation(
            summary = "Вивести зарплату",
            description = "Вивести сумарну зарплату всіх працівників"
    )
    @GetMapping("/get/salaries-sum")
    public Integer getSalarySum() {
        return service.getSalarySum();
    }

    @Operation(
            summary = "Згрупувати по типу працівника та порахувати суму зарплат",
            description = "Згрупувати по типу працівника та порахувати суму зарплат"
    )
    @GetMapping("/groupBy/employeeType/get/salaries-sum")
    public Map<EmployeeType, Integer> groupSalaryByEmployeeType() {
        return service.groupSalaryByEmployeeType();
    }


    @Operation(
            summary = "Знайти працівників за днем народження після заданої дати",
            description = "Знайти працівників за днем народження після заданої дати"
    )
    @GetMapping("/get/employees/birthdate-after={after}")
    public List<Employee> getEmployeeWithBirthdateAfter(
            @PathVariable
            @Parameter(description = "Дата народження (1990-05-12)")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
                    LocalDate after) {
        return service.getEmployeeWithBirthdateAfter(after);
    }

    @Operation(
            summary = "Знайти працівників за днем народження перед заданою датою",
            description = "Знайти працівників за днем народження перед заданою датою"
    )
    @GetMapping("/get/employees/birthdate-before={before}")
    public List<Employee> getEmployeeWithBirthdateBefore(
            @PathVariable
            @Parameter(description = "Дата народження (1990-05-12)")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
                    LocalDate before) {
        return service.getEmployeeWithBirthdateBefore(before);
    }

    @Operation(
            summary = "Знайти працівників за днем народження між заданими датами",
            description = "Знайти працівників за днем народження між заданими датами"
    )
    @GetMapping("/get/employees/birthdate-after={after}/birthdate-before={before}")
    public List<Employee> getEmployeeWithBirthdateBetween(
            @PathVariable
            @Parameter(description = "Дата народження після (1990-05-12)")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
                    LocalDate after,
            @PathVariable
            @Parameter(description = "Дата народження до (2000-05-12)")
            @DateTimeFormat(pattern = "yyyy-MM-dd")
                    LocalDate before) {
        return service.getEmployeeWithBirthdateBetween(after, before);
    }

    @Operation(
            summary = "Згрупувати дохід за жанром спектаклю",
            description = "Згрупувати дохід за жанром спектаклю"
    )
    @GetMapping("/groupby/genre/get/income")
    public Map<Genre, Double> groupIncomeByGenre() {
        return service.groupIncomeByGenre();
    }

    @Operation(
            summary = "Згрупувати кількість проданих квитків за жанром спектаклю",
            description = "Згрупувати кількість проданих квитків за жанром спектаклю"
    )
    @GetMapping("/groupby/genre/get/frequency")
    public Map<Genre, Integer> groupFrequencyByGenre() {
        return service.groupFrequencyByGenre();
    }

    @Operation(
            summary = "Згрупувати дохід за типом місця",
            description = "Згрупувати дохід за типом місця"
    )
    @GetMapping("/groupby/place-type/get/income")
    public Map<PlaceType, Double> groupIncomeByPlaceType() {
        return service.groupIncomeByPlaceType();
    }

    @Operation(
            summary = "Згрупувати кількість проданих квитків за типом місця",
            description = "Згрупувати кількість проданих квитків за типом місця"
    )
    @GetMapping("/groupby/place-type/get/frequency")
    public Map<PlaceType, Integer> groupFrequencyByPlaceType() {
        return service.groupFrequencyByPlaceType();
    }

    @Operation(
            summary = "Згрупувати заробіток за датою",
            description = "Згрупувати заробіток за датою"
    )
    @GetMapping("/groupby/date/get/income")
    public Map<LocalDate, Double> groupIncomeByDate() {
        return service.groupIncomeByDate();
    }
}
