package com.ready2die.bulider.case2.step1;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

    public static void main(String[] args) {
        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("관악구 봉천동")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(2000, Month.APRIL, 21))
                .sex("male")
                .driverLicence(true)
                .married(true)
                .build();

        System.out.println(p1.getAddressOne());

    }

}
