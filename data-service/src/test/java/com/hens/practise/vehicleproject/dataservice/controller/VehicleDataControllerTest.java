package com.hens.practise.vehicleproject.dataservice.controller;

import com.hens.practise.vehicleproject.dataservice.entity.Vehicle;
import com.hens.practise.vehicleproject.dataservice.repository.VehicleRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
class VehicleDataControllerTest {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private VehicleRepository vehicleRepository;


    @Test
    void testVehicleRepository() {

        // given
        Vehicle vehicle1 = new Vehicle("VIN1", "REGNR1", "CUSTOMER1", "ADDRESS1", "Connected");
        Vehicle vehicle2 = new Vehicle("VIN2", "REGNR2", "CUSTOMER2", "ADDRESS2", "Disconnected");
        entityManager.persist(vehicle1);
        entityManager.persist(vehicle2);
        entityManager.flush();

        // when
        List<Vehicle> vehicleList1 = vehicleRepository.findByCustomer(vehicle1.getCustomer());
        List<Vehicle> vehicleList2 = vehicleRepository.findByStatus("Disconnected");

        // then
        Assertions.assertThat(vehicleList1.get(0)).isEqualTo(vehicle1);
        Assertions.assertThat(vehicleList2.size()).isEqualTo(3);
    }

    @Test
    void getAllVehicles() {
    }

    @Test
    void getAllVehiclesByCustomer() {
    }

    @Test
    void getAllVehiclesByStatus() {
    }

    @Test
    void getAllCustomers() {
    }
}