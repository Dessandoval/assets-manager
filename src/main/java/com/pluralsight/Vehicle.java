package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public BigDecimal getValue(){
        int vehicleAge = java.time.LocalDate.now().getYear() - this.year;
        BigDecimal value;

        if(vehicleAge <= 3){
            value = getOriginalCost().multiply(BigDecimal.ONE.subtract(new BigDecimal("0.03").multiply(new BigDecimal(vehicleAge))));
        }
        else if(vehicleAge <= 6){
            value = getOriginalCost().multiply(BigDecimal.ONE.subtract(new BigDecimal("0.06").multiply(new BigDecimal(vehicleAge))));
        }
        else if(vehicleAge <= 10){
            value = getOriginalCost().multiply(BigDecimal.ONE.subtract(new BigDecimal("0.08").multiply(new BigDecimal(vehicleAge))));
        }
        else{
            value = new BigDecimal("1000");
        }
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            value = value.multiply(new BigDecimal("0.75"));
        }
        return value;
    }
}
