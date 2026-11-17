package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1 = new House("", "2018", new BigDecimal("235,500"), "lady lane", 2, 1800, 6000 );
        System.out.println(house1);

    }
}
