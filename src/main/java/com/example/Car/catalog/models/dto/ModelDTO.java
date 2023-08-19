package com.example.Car.catalog.models.dto;

import com.example.Car.catalog.models.entity.Brand;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ModelDTO {
    private Long id;
    private String name;
    private Brand brand;

    public ModelDTO() {
    }

    public ModelDTO(String name, Brand brand) {
        this.name = name;
        this.brand = brand;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }
    @Size(min = 2, max = 50, message = "Content length must be between 2 and 50 characters!")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @NotBlank(message = "cannot be empty")
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
