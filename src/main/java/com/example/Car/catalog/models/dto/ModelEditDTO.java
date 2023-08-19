package com.example.Car.catalog.models.dto;

import com.example.Car.catalog.models.entity.Brand;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ModelEditDTO {
    private Long id;
    private String name;
    private Long brandId;

    public ModelEditDTO() {
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
    @NotBlank(message = "cannot be empty")

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
