package com.hens.practise.vehicleproject.dataservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "VIN")
    private String vin;

    @Column(name = "REGNR")
    private String regnr;

    @Column(name = "CUSTOMER")
    private String customer;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "STATUS")
    private String status;

    public Vehicle() {
    }

//    public Vehicle(long id, String vin, String regnr, String customer, String address, String status) {
//        this.id = id;
//        this.vin = vin;
//        this.regnr = regnr;
//        this.customer = customer;
//        this.address = address;
//        this.status = status;
//    }

    public Vehicle(String vin, String regnr, String customer, String address, String status) {

        this.vin = vin;
        this.regnr = regnr;
        this.customer = customer;
        this.address = address;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id &&
                vin.equals(vehicle.vin) &&
                regnr.equals(vehicle.regnr) &&
                customer.equals(vehicle.customer) &&
                address.equals(vehicle.address) &&
                status.equals(vehicle.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vin, regnr, customer, address, status);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", regnr='" + regnr + '\'' +
                ", customer='" + customer + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
