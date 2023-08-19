package com.example.Car.catalog.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MODEL")
public class Model extends BaseEntity{
    private String name;
    private Brand brand;


    public Model() {
    }

    public Model(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }
    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
