package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeEmployee {
    private List<Employee> employees = new ArrayList<>(Arrays.asList(
            Employee.builder()
                    .id(null)
                    .name("Савченко Ігор Васильович")
                    .sex(Sex.MALE)
                    .birthDate(LocalDate.parse("1983-12-01"))
                    .salary(13000)
                    .employmentDate(LocalDate.parse("2018-05-07"))
                    .description("")
                    .created_at(LocalDateTime.now())
                    .modified_at(LocalDateTime.now())
                    .build(),
            Employee.builder()
                    .id(null)
                    .name("Остапенко Василь Васильович")
                    .sex(Sex.MALE)
                    .birthDate(LocalDate.parse("1975-04-21"))
                    .salary(13000)
                    .employmentDate(LocalDate.parse("2019-03-11"))
                    .description("")
                    .created_at(LocalDateTime.now())
                    .modified_at(LocalDateTime.now())
                    .build(),
            Employee.builder()
                    .id(null)
                    .name("Воля Інна Григорівна")
                    .sex(Sex.FEMALE)
                    .birthDate(LocalDate.parse("1978-11-17"))
                    .salary(12000)
                    .employmentDate(LocalDate.parse("2020-03-20"))
                    .description("")
                    .created_at(LocalDateTime.now())
                    .modified_at(LocalDateTime.now())
                    .build(),
            Employee.builder()
                    .id(null)
                    .name("Ніцин Ольга Вікторівна")
                    .sex(Sex.FEMALE)
                    .birthDate(LocalDate.parse("1997-12-12"))
                    .salary(11500)
                    .employmentDate(LocalDate.parse("2020-03-20"))
                    .description("")
                    .created_at(LocalDateTime.now())
                    .modified_at(LocalDateTime.now())
                    .build(),
            Employee.builder()
                    .id(null)
                    .name("Борчук Андрій Олегович")
                    .sex(Sex.MALE)
                    .birthDate(LocalDate.parse("1995-04-24"))
                    .salary(11500)
                    .employmentDate(LocalDate.parse("2019-02-20"))
                    .description("")
                    .created_at(LocalDateTime.now())
                    .modified_at(LocalDateTime.now())
                    .build()
                                                                    ));

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
