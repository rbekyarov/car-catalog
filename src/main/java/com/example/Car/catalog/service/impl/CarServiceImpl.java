package com.example.Car.catalog.service.impl;

import com.example.Car.catalog.models.dto.CarDTO;
import com.example.Car.catalog.models.dto.CarEditDTO;
import com.example.Car.catalog.models.entity.Car;
import com.example.Car.catalog.repository.CarRepository;
import com.example.Car.catalog.service.CarService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final ModelMapper modelMapper;

    public CarServiceImpl(CarRepository carRepository, ModelMapper modelMapper) {
        this.carRepository = carRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void addCar(CarDTO carDTO) {
        Car car = modelMapper.map(carDTO, Car.class);


        carRepository.save(car);
    }

    @Override
    public void removeCar(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public Optional<Car> findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public void editCar(CarEditDTO carEditDTO, Long id) {
        Long fuelTypeId = carEditDTO.getFuelTypeId();
        Long modelId = carEditDTO.getModelId();
        BigDecimal price = carEditDTO.getPrice();
        LocalDate regDate = carEditDTO.getRegDate();
        String remarks = carEditDTO.getRemarks();
        Long transmissionId = carEditDTO.getTransmissionId();
        String vinNumber = carEditDTO.getVinNumber();
        carRepository.editCar(vinNumber,transmissionId,remarks,regDate,price,modelId,fuelTypeId, id);
    }

    @Override
    public List<Car> searchByPrice(BigDecimal price) {
        return carRepository.findByPrice(price);
    }

    @Override
    public List<Car> searchByModel(String modelName) {
        return carRepository.findByModel(modelName);
    }

    @Override
    public List<Car> searchByBrand(String brandName) {
        return carRepository.findByBrand(brandName);
    }

    @Override
    public List<Car> searchByFuelType(String fuelTypeName) {
        return carRepository.findByFuelTypeName(fuelTypeName);
    }

    @Override
    public List<Car> searchByRegDate(LocalDate localDate) {
        return carRepository.findByRegDate(localDate);
    }

    @Override
    public List<Car> searchByTransmissionType(String transmissionTypeName) {
        return carRepository.findByTransmissionType(transmissionTypeName);
    }

    @Override
    public List<Car> orderByPriceDesc() {
        return carRepository.orderByPriceDesc();
    }


}
