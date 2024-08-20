package com.datacars.aluguelcarros.repository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.datacars.aluguelcarros.entities.Car;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository  extends CrudRepository<Car, Long>, JpaSpecificationExecutor<Car> {

}
