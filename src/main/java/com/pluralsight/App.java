package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("My house", "2024-10-26", new BigDecimal("400500.00"), "56 No Lane", 2, 9000, 11000));
        assets.add(new House("House", "2023-09-24", new BigDecimal("500000.00"), "45 Yes Lane", 3, 8000, 9000));
        assets.add(new Vehicle("my car", "2020-05-11", new BigDecimal("300000"), "GMC Sierra", 2018, 15000));
        assets.add(new Vehicle("Tom's truck", "2023-02-02", new BigDecimal("60000"), "Ram", 2016, 20000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
        }


    }
}
