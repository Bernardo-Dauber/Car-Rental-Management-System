package com.datacars.aluguelcarros.repository;

import com.datacars.aluguelcarros.entities.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

//    List<Customer> findByName(String name);
//    Optional<Customer> findById(Long id);
//    List<Customer> findByEmail(String email);

}
