package com.hens.practise.vehicleproject.dataservice.repository;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findAllVehiclesByCustomer(String customer);
    List<Vehicle> findVehiclesByStatus(String status);

    @Query("select distinct customer from vehicle")
    List<String> findDistinctCustomer();
}