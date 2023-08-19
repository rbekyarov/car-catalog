package com.example.Car.catalog.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BRAND")
public class Brand extends BaseEntity{
    private String name;

    public Brand() {
    }

    public Brand(String name) {
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
