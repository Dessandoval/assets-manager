package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1 = new House("house", "2018", new BigDecimal("235500"), "lady lane", 2, 1800, 6000 );
        System.out.println(house1.getValue());

        Vehicle car1 = new Vehicle("Honda", "2018", new BigDecimal("20000"),"Accord", 2024, 2156);
        System.out.println(car1.getValue());



    }
}
