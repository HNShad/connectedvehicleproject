package com.hens.practise.vehicleproject.dataservice.service;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import com.hens.practise.vehicleproject.dataservice.repository.VehicleRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@DataJpaTest
class VehicleDataServiceTest {

    @Mock
    private VehicleRepository vehicleRepository;

    @InjectMocks
    private VehicleDataService vehicleDataService;


    @Test
    void findVehiclesByCustomer() {

        // given
        Vehicle vehicle1 = new Vehicle("VIN1", "REGNR1", "CUSTOMER1", "ADDRESS1", "Connected");
        List<Vehicle> vehicleList = Arrays.asList(vehicle1);

        // when
        when(vehicleRepository.findByCustomer("CUSTOMER1")).thenReturn(vehicleList);

        // then
        Assertions.assertThat(vehicleDataService.findVehiclesByCustomer("CUSTOMER1")).contains(vehicle1);
    }

    @Test
    void findVehiclesByStatus() {

        // given
        Vehicle vehicle1 = new Vehicle("VIN1", "REGNR1", "CUSTOMER1", "ADDRESS1", "Connected");
        List<Vehicle> vehicleList = Arrays.asList(vehicle1);

        // when
        when(vehicleRepository.findByStatus("Connected")).thenReturn(vehicleList);

        // then
        Assertions.assertThat(vehicleDataService.findVehiclesByStatus("Connected")).contains(vehicle1);
    }
}