package com.hens.practise.vehicleproject.dataservice.repository;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {


    List<Vehicle> findByCustomer(String customer);
    List<Vehicle> findByStatus(String status);

//    @Query("select distinct customer from vehicle")
//    List<String> findDistinctCustomer();
}
