package com.hens.practise.vehicleproject.dataservice.controller;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import com.hens.practise.vehicleproject.dataservice.repository.VehicleRepository;
import com.hens.practise.vehicleproject.dataservice.service.VehicleDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@RequiredArgsConstructor
public class VehicleDataController {

    private final VehicleDataService vehicleDataService;


    @GetMapping("/findall")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {

        return new ResponseEntity(vehicleDataService.findAllVehicles(), HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Vehicle>> getAllVehiclesByCustomer(@RequestParam("customer") String name) {

        return new ResponseEntity<>(vehicleDataService.findVehiclesByCustomer(name), HttpStatus.OK);
    }

    @GetMapping("/statuses")
    public ResponseEntity<List<Vehicle>> getAllVehiclesByStatus(@RequestParam("status") String status) {

        return new ResponseEntity<>(vehicleDataService.findVehiclesByStatus(status), HttpStatus.OK);
    }

    @GetMapping("/customers/all")
    public ResponseEntity<List<String>> getAllCustomers() {

//        return new ResponseEntity<>(vehicleRepository.findDistinctCustomer(), HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
