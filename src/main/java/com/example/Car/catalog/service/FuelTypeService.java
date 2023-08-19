package com.example.Car.catalog.service;

import com.example.Car.catalog.models.dto.FuelTypeDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.models.entity.FuelType;

import java.util.List;
import java.util.Optional;

public interface FuelTypeService {

    List<FuelType> findAllFuelTypes();
    void addFuelType(FuelTypeDTO fuelTypeDTO);
    void removeFuelType(Long id);
    Optional<FuelType> findById(Long id);

    void editFuelType(String name, Long id);
}
