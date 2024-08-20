package com.datacars.aluguelcarros.repository;

import com.datacars.aluguelcarros.entities.Car;
import com.datacars.aluguelcarros.entities.Customer;
import com.datacars.aluguelcarros.entities.Rental;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface RentalRepository extends CrudRepository<Rental, Long> {

//    List<Rental> findByCarAndCustomer(Car car, Customer customer);
//
//    List<Rental> findByCustomerId(Long customerId);
//
//    List<Rental> findByStartDate(Date startDate);
//
//    List<Rental> findByCar(Car car);

}
