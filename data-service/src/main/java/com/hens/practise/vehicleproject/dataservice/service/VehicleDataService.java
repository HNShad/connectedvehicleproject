package com.hens.practise.vehicleproject.dataservice.service;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import com.hens.practise.vehicleproject.dataservice.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class VehicleDataService {

    private final VehicleRepository vehicleRepository;

    public List<Vehicle> findVehiclesByCustomer(String customer) {
        return vehicleRepository.findByCustomer(customer);
    }

    public List<Vehicle> findVehiclesByStatus(String status) {

        return vehicleRepository.findByStatus(status);
    }

    public List<Vehicle> findAllVehicles() {

        return vehicleRepository.findAll();
    }
}
