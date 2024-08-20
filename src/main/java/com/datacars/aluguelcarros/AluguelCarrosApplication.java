package com.datacars.aluguelcarros;
//https://chatgpt.com/c/087e9b2b-a353-40df-8d5c-4efd8aa55550
import com.datacars.aluguelcarros.entities.Car;
import com.datacars.aluguelcarros.entities.Customer;

import com.datacars.aluguelcarros.services.CarService;
import com.datacars.aluguelcarros.services.CustomerService;
import com.datacars.aluguelcarros.services.RentalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import  java.util.List;
@SpringBootApplication
public class AluguelCarrosApplication {

    private static final Logger log = LoggerFactory.getLogger(AluguelCarrosApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AluguelCarrosApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarService carService,  CustomerService customerService, RentalService rentalService) {
        return (args) -> {



            List<Car> availableCars = carService.findCars(true, null, null, null, null, null);
            System.out.println("Carros disponíveis: " + availableCars);

            // Testar a busca por preço diário
            List<Car> cheapCars = carService.findCars(null, 190.0, null, null, null, null);
            System.out.println("Carros com preço diário menor ou igual a 190: " + cheapCars);

            // Testar a busca por ano e disponibilidade
            List<Car> recentCars = carService.findCars(true, null, null, 2022, null, null);
            System.out.println("Carros do ano 2022 e disponíveis: " + recentCars);
        };





    }
}

