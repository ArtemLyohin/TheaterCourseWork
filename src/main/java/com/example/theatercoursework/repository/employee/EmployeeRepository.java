package com.example.theatercoursework.repository.employee;

import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    List<Employee> findByBirthDateAfter(LocalDate after);

    List<Employee> findByBirthDateBefore(LocalDate before);

    List<Employee> findByBirthDateBetween(LocalDate after, LocalDate before);
}
