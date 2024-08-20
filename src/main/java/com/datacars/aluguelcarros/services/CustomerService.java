package com.datacars.aluguelcarros.services;

import com.datacars.aluguelcarros.entities.Customer;
import com.datacars.aluguelcarros.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}

//    public void logfindbyEmail(String email){
//        log.info("Customer with email: {}", email);
//        log.info("------------------");
//        customerRepository.findByEmail(email).forEach(customer -> log.info(customer.toString()));
//        log.info("");
//    }
//
//
//    public void  logFindByName(String name){
//        log.info("Customer with name: {}", name);
//        log.info("-----------------------------");
//        customerRepository.findByName(name).forEach(customer -> log.info(customer.toString()));
//        log.info("");
//    }
//
//    public void logFindById(long id){
//        customerRepository.findById(id);
//    }
//}
