package com.example.Car.catalog.models.dto;

import com.example.Car.catalog.models.entity.FuelType;
import com.example.Car.catalog.models.entity.Model;
import com.example.Car.catalog.models.entity.Transmission;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CarEditDTO {
    private Long id;
    private String vinNumber;
    private Long modelId;

    private BigDecimal price;

    private LocalDate regDate;

    private Long transmissionId;

    private Long fuelTypeId;

    private String remarks;

    public CarEditDTO() {
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
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
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
    public Long getTransmissionId() {
        return transmissionId;
    }

    public void setTransmissionId(Long transmissionId) {
        this.transmissionId = transmissionId;
    }
    @NotBlank(message = "cannot be empty")

    public Long getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(Long fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    @NotBlank(message = "cannot be empty")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
