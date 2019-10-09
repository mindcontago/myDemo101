package com.example.myDemo110.repository;


import com.example.myDemo110.modelEntity.ModelCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelCarRepository extends JpaRepository<ModelCar, Integer> {
    ModelCar findByName(String name); //Crud give CRUD methods
}
