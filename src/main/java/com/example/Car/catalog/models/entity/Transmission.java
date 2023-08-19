package com.example.Car.catalog.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRANSMISSION")
public class Transmission extends BaseEntity{
    private String name;

    public Transmission(String name) {
        this.name = name;
    }

    public Transmission() {
    }
    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
