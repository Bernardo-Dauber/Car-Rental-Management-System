package com.datacars.aluguelcarros.services;

import com.datacars.aluguelcarros.entities.Car;
import com.datacars.aluguelcarros.repository.CarRepository;
import com.datacars.aluguelcarros.specifications.CarSpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findCars(Boolean available, Double dailyPrice, Integer mileage, Integer year, String brand, String model) {
        Specification<Car> spec = Specification.where(null);

        if (available != null) {
            spec = spec.and(CarSpec.isAvailable(available));
        }

        if (dailyPrice != null) {
            spec = spec.and(CarSpec.hasDailyPriceLessThanEqual(dailyPrice));
        }

        if (mileage != null) {
            spec = spec.and(CarSpec.hasMileageLessThanEqual(mileage));
        }

        if (year != null) {
            spec = spec.and(CarSpec.hasYear(year));
        }

        if (brand != null) {
            spec = spec.and(CarSpec.hasBrand(brand));
        }

        if (model != null) {
            spec = spec.and(CarSpec.hasModel(model));
        }

        return carRepository.findAll(spec);
    }
}
