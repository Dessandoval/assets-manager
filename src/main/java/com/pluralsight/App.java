package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        int currentYear = LocalDateTime.now().getYear();

        House house1 = new House("house", "2018", new BigDecimal("235500"), "lady lane", 2, 1800, 6000 );
        System.out.println(house1.getValue());

        Vehicle car1 = new Vehicle("Ford", "2018", new BigDecimal("20000"),"Bronco", 2024, 50000);
        System.out.println(car1.getValue());

        Vehicle car2 = new Vehicle("Honda", "2000", new BigDecimal("25500"), "Accord", 1990, 150000);
        System.out.println(car2.getValue());



    }
}
