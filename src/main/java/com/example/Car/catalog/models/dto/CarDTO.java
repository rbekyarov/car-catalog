package com.example.Car.catalog.models.dto;

import com.example.Car.catalog.models.entity.FuelType;
import com.example.Car.catalog.models.entity.Model;
import com.example.Car.catalog.models.entity.Transmission;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CarDTO {
    private Long id;
    private String vinNumber;
    private Model model;

    private BigDecimal price;

    private LocalDate regDate;

    private Transmission transmission;

    private FuelType fuelType;

    private String remarks;

    public CarDTO() {
    }

    public CarDTO(String vinNumber, Model model, BigDecimal price, LocalDate regDate, Transmission transmission, FuelType fuelType, String remarks) {
        this.vinNumber = vinNumber;
        this.model = model;
        this.price = price;
        this.regDate = regDate;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @NotBlank(message = "cannot be empty")
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
    @NotBlank(message = "cannot be empty")
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    @NotNull(message = "Field cannot be empty")
    @DecimalMin(value = "0", message = "Accepts only positive numbers")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @NotBlank(message = "cannot be empty")
    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
    @NotBlank(message = "cannot be empty")
    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    @NotBlank(message = "cannot be empty")
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    @NotBlank(message = "cannot be empty")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
