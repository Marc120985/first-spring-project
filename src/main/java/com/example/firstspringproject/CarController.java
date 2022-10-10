package com.example.firstspringproject;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("cars")
public class CarController {

    private CarService carService = new CarService();

    @PostMapping
    public Car addCar(@RequestBody Car car){
        carService.addCar(car);
        return car;
    }
        // Diese Methode gibt die Hashmap mit UUID aus
//    @GetMapping
//        public Map<String, Car> getCars(){
//        return carService.getCars();
//    }

    @GetMapping(path = "{id}")
    public Car getCar (@PathVariable String id){
        return carService.getCars().get(id);
    }

    @GetMapping
    public List<Car> getCars(){
        return new ArrayList<>(carService.getCars().values());
       }

}
