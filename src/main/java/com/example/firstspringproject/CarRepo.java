package com.example.firstspringproject;

import java.util.HashMap;
import java.util.Map;

public class CarRepo {
    Map<String, Car> cars;

    public CarRepo(){
        this.cars = new HashMap<>();
    }


    public void addToList(String id, Car newCar) {
        cars.put(id, newCar);
       // System.out.println(carList);
    }

    public Map<String, Car> getCars() {
        return cars;
    }
}
