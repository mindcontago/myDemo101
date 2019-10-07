package com.example.myDemo110;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelCarRepository extends CrudRepository<ModelCar, Integer> {
    ModelCar findByName(String name); //Crud give CRUD methods
}
