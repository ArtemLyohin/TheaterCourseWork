package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Servant;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.ServantType;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeServant {
    private List<Servant> servants = new ArrayList<>(Arrays.asList(
            new Servant(null, "Галайчук Ігор Васильович", Sex.MALE,
                        LocalDate.parse("1982-11-22"),null, EmployeeType.SERVANT,
                        14000, LocalDate.parse("2019-05-13"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.GUARD),
            new Servant(null, "Терещук Олег Васильович", Sex.MALE,
                        LocalDate.parse("1984-10-07"),null, EmployeeType.SERVANT,
                        14000, LocalDate.parse("2019-05-13"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.GUARD),
            new Servant(null, "Білий Остап Олегович", Sex.MALE,
                        LocalDate.parse("1994-12-30"),null, EmployeeType.SERVANT,
                        14000, LocalDate.parse("2020-03-17"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.GUARD),
            new Servant(null, "Білий Ігор Олегович", Sex.MALE,
                        LocalDate.parse("1992-07-12"),null, EmployeeType.SERVANT,
                        14000, LocalDate.parse("2020-03-17"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.GUARD),
            new Servant(null, "Балич Ольга Володимирівна", Sex.FEMALE,
                        LocalDate.parse("1995-01-13"),null, EmployeeType.SERVANT,
                        10000, LocalDate.parse("2020-03-20"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.CASHIER),
            new Servant(null, "Бука Оксана Володимирівна", Sex.FEMALE,
                        LocalDate.parse("1999-10-11"),null, EmployeeType.SERVANT,
                        10000, LocalDate.parse("2020-03-20"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.CASHIER),
            new Servant(null, "Боженко Микита Назарович", Sex.MALE,
                        LocalDate.parse("1999-07-23"),null, EmployeeType.SERVANT,
                        10000, LocalDate.parse("2019-11-13"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.CASHIER),
            new Servant(null, "Байрак Олена Вікторівна", Sex.FEMALE,
                        LocalDate.parse("1999-11-22"),null, EmployeeType.SERVANT,
                        10000, LocalDate.parse("2019-11-17"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.CLEANER),
            new Servant(null, "Абаєва Вікторія Степанівна", Sex.FEMALE,
                        LocalDate.parse("1993-04-18"),null, EmployeeType.SERVANT,
                        11000, LocalDate.parse("2018-10-12"), "",
                        LocalDateTime.now(), LocalDateTime.now(), ServantType.CLEANER)
                                                                  ));

    public List<Servant> getServants() {
        return servants;
    }

    public void setServants(List<Servant> servants) {
        this.servants = servants;
    }
}
