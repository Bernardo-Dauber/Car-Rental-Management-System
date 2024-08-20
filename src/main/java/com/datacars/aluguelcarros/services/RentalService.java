package com.datacars.aluguelcarros.services;


import com.datacars.aluguelcarros.entities.Car;
import com.datacars.aluguelcarros.entities.Customer;
import com.datacars.aluguelcarros.entities.Rental;
import com.datacars.aluguelcarros.repository.CarRepository;
import com.datacars.aluguelcarros.repository.CustomerRepository;
import com.datacars.aluguelcarros.repository.RentalRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RentalService {

    private final CarRepository carRepository;
    private final RentalRepository rentalRepository;
    private final CustomerRepository customerRepository;


    public RentalService(CarRepository carRepository, RentalRepository rentalRepository,CustomerRepository customerRepository) {
        this.carRepository = carRepository;
        this.rentalRepository = rentalRepository;
        this.customerRepository = customerRepository;
    }

    public void RentCar(Long carId, Customer customer) {}


//    public List<Rental> getRentalsByCustomerId(Long customerId) {
//        Optional<Customer> customerOpt = customerRepository.findById(customerId);
//
//        if (customerOpt.isPresent()) {
//            return rentalRepository.findByCustomerId(customerId);
//        } else {
//            throw new RuntimeException("No customer found with ID: " + customerId);
//        }
//    }



}
