package com.example.Car.catalog.models.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "CAR")
public class Car extends BaseEntity {

    private String vinNumber;
    private Model model;

    private BigDecimal price;

    private LocalDate regDate;

    private Transmission transmission;

    private FuelType fuelType;

    private String remarks;

    public Car() {
    }

    public Car(String vinNumber, Model model, BigDecimal price, LocalDate regDate, Transmission transmission, FuelType fuelType, String remarks) {
        this.vinNumber = vinNumber;
        this.model = model;
        this.price = price;
        this.regDate = regDate;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.remarks = remarks;
    }
    @Column(name = "vin_number")
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    @Column
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @Column(name = "reg_date")
    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }
    @ManyToOne
    @JoinColumn(name = "transmission_id", referencedColumnName = "id")
    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    @ManyToOne
    @JoinColumn(name = "fuel_type_id", referencedColumnName = "id")
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", price=" + price +
                ", regDate=" + regDate +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
