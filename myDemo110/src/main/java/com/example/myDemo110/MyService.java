package com.example.myDemo110;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired private ModelCarRepository modelCarRepository;



    //@Autowired здесь не нужен
    public void myServiceMethod(){ //vys iz comt
        modelCarRepository.findByName("12345");

        System.out.println("This is MyService method");
    }
    public void mySaveCar(ModelCar car){
        modelCarRepository.save(car);
    }

}
