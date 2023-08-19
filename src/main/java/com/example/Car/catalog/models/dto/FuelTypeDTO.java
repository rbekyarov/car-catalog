package com.example.Car.catalog.models.dto;

import javax.validation.constraints.Size;

public class FuelTypeDTO {
    private Long id;
    private String name;

    public FuelTypeDTO() {
    }

    public FuelTypeDTO(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    @Size(min = 3, max = 10, message = "Content length must be between 3 and 10 characters!")

    public void setName(String name) {
        this.name = name;
    }
}
