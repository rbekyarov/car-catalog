package com.example.Car.catalog.models.dto;

import javax.validation.constraints.Size;

public class TransmissionDTO {

    private Long id;
    private String name;

    public TransmissionDTO() {
    }

    public TransmissionDTO(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Size(min = 2, max = 50, message = "Content length must be between 2 and 50 characters!")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
