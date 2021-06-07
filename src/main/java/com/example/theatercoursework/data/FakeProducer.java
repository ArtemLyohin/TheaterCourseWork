package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.ProducerType;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeProducer {
    private List<Producer> producers = new ArrayList<>(Arrays.asList(
            new Producer(null, "Борний Ігор Васильович", Sex.MALE,
                         LocalDate.parse("1985-07-23"),null, EmployeeType.PRODUCER,
                         17000, LocalDate.parse("2015-05-13"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.DIRECTOR),
            new Producer(null, "Огоренко Давид Танасійович", Sex.MALE,
                         LocalDate.parse("1973-11-28"),null, EmployeeType.PRODUCER,
                         20000, LocalDate.parse("2012-12-03"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.DIRECTOR),
            new Producer(null, "Віращук Олена Степанівна", Sex.FEMALE,
                         LocalDate.parse("1986-04-12"),null, EmployeeType.PRODUCER,
                         18000, LocalDate.parse("2014-11-23"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.DIRECTOR),
            new Producer(null, "Гірка Інна Олегівна", Sex.FEMALE,
                         LocalDate.parse("1990-04-12"),null, EmployeeType.PRODUCER,
                         15000, LocalDate.parse("2018-04-04"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.ARTIST),
            new Producer(null, "Дук Роман Остапович", Sex.MALE,
                         LocalDate.parse("1986-11-27"),null, EmployeeType.PRODUCER,
                         15000, LocalDate.parse("2018-04-04"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.ARTIST),
            new Producer(null, "Каруш Йосип Остапович", Sex.MALE,
                         LocalDate.parse("1982-10-22"),null, EmployeeType.PRODUCER,
                         16000, LocalDate.parse("2017-06-13"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.ARTIST),
            new Producer(null, "Некоряк Віталій Володимирович", Sex.MALE,
                         LocalDate.parse("1973-08-06"),null, EmployeeType.PRODUCER,
                         20000, LocalDate.parse("2011-03-14"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.CONDUCTOR),
            new Producer(null, "Ярна Владислава Ігорівна", Sex.FEMALE,
                         LocalDate.parse("1980-12-07"),null, EmployeeType.PRODUCER,
                         20000, LocalDate.parse("2012-01-13"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.CONDUCTOR),
            new Producer(null, "Зіновенко Міла Орестівна", Sex.FEMALE,
                         LocalDate.parse("1983-02-07"),null, EmployeeType.PRODUCER,
                         20000, LocalDate.parse("2016-03-13"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.AUTHOR),
            new Producer(null, "Райчинець Олександра Олександрівна", Sex.FEMALE,
                         LocalDate.parse("1995-11-12"),null, EmployeeType.PRODUCER,
                         18000, LocalDate.parse("2020-06-22"), "",
                         LocalDateTime.now(), LocalDateTime.now(), ProducerType.AUTHOR)
                                                                    ));

    public List<Producer> getProducers() {
        return producers;
    }

    public void setProducers(List<Producer> producers) {
        this.producers = producers;
    }
}
