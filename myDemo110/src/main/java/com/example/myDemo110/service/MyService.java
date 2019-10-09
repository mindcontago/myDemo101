package com.example.myDemo110.service;

import com.example.myDemo110.modelEntity.ModelCar;
import com.example.myDemo110.repository.ModelCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired private ModelCarRepository modelCarRepository;



    //@Autowired здесь не нужен
    public ModelCar myServiceMethod(){ //vys iz comt
        System.out.println("This is MyService method");
        return modelCarRepository.findByName("bmw");
    }
    //public void mySaveCar(ModelCar car){
     //   modelCarRepository.save(car);
    //}

}
