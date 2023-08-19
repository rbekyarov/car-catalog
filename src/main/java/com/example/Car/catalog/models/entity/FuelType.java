package com.example.Car.catalog.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "FUEL_TYPE")
public class FuelType extends BaseEntity{
    private String name;

    public FuelType() {
    }

    public FuelType(String name) {
        this.name = name;
    }
    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
