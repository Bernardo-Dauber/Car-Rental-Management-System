package com.datacars.aluguelcarros.specifications;
import com.datacars.aluguelcarros.entities.Car;
import org.springframework.data.jpa.domain.Specification;
public class CarSpec {

    public static Specification<Car> isAvailable(boolean available){
        return((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("available"),available));
    }

    public static Specification<Car> hasDailyPriceLessThanEqual(Double dailyPrice){
        return  (root, query, criteriaBuilder) -> {
            if(dailyPrice == null){return null;}
            else{return criteriaBuilder.lessThanOrEqualTo(root.get("dailyPrice"),dailyPrice);}
        };
    }

    public static Specification<Car> hasMileageLessThanEqual(Integer mileage){
        return (root, query, criteriaBuilder) -> {
            if(mileage == null){return null;}
            else{ return  criteriaBuilder.lessThanOrEqualTo(root.get("mileage"),mileage);}
        };
    }

    public static Specification<Car> hasYear(Integer year){
        return (root, query, criteriaBuilder) -> {
            if(year == null){return null;}
            else{ return  criteriaBuilder.lessThanOrEqualTo(root.get("year"),year);}
        };
    }

    public static Specification<Car> hasBrand(String  brand){
        return (root, query, criteriaBuilder) -> {
            if(brand == null){return null;}
            else{ return  criteriaBuilder.lessThanOrEqualTo(root.get("brand"),brand);}
        };
    }

    public static Specification<Car> hasModel(String  model){
        return (root, query, criteriaBuilder) -> {
            if(model == null){return null;}
            else{ return  criteriaBuilder.lessThanOrEqualTo(root.get("model"),model);}
        };
    }

}
