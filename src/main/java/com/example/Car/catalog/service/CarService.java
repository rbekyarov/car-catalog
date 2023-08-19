package com.example.Car.catalog.service;

import com.example.Car.catalog.models.dto.CarDTO;
import com.example.Car.catalog.models.dto.CarEditDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.models.entity.Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> findAllCars();
    void addCar(CarDTO carDTO);
    void removeCar(Long id);
    Optional<Car> findById(Long id);

    void editCar(CarEditDTO carEditDTO, Long id);
    List<Car> searchByPrice(BigDecimal price);
    List<Car> searchByModel(String modelName);
    List<Car> searchByBrand(String brandName);
    List<Car> searchByFuelType(String fuelTypeName);
    List<Car> searchByRegDate(LocalDate localDate);
    List<Car> searchByTransmissionType(String transmissionTypeName);
    List<Car> orderByPriceDesc();

}
