package com.datacars.aluguelcarros.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rental {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    private Car  car;
    @ManyToOne
    private Customer customer;




    public Rental() {}


    public Rental(Car car, Customer customer, Date endDate, Date startDate) {
        this.car = car;
        this.customer = customer;
        this.endDate = endDate;
        this.startDate = startDate;

    }



    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
