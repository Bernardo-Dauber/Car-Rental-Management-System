package com.datacars.aluguelcarros.entities;

import jakarta.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carModel;
    private int year;
    private int mileage;
    private double dailyPrice;
    private String brand;
    @Column(name = "available")
    private boolean available = true;


    protected Car(){}

    public Car(String brand, String carModel, double dailyPrice, boolean isAvaliable, int mileage, int year) {
        this.brand = brand;
        this.carModel = carModel;
        this.dailyPrice = dailyPrice;
        this.available = isAvaliable;
        this.mileage = mileage;
        this.year = year;
    }



    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", mileage=" + mileage +
                ", dailyPrice=" + dailyPrice +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getAvaliable() {
        return available;
    }

    public void setAvaliable(boolean avaliable) {
        available = avaliable;
    }
}

