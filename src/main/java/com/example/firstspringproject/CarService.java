package com.example.firstspringproject;

import java.util.Map;
import java.util.UUID;

public class CarService {
    private CarRepo carRepo = new CarRepo();

    public Car addCar(Car car){
        String id= UUID.randomUUID().toString();
        carRepo.addToList(id, car);
        return car;
    }
    public Map<String, Car> getCars(){
        return carRepo.getCars();
    }
}
