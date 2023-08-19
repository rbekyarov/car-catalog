package com.example.Car.catalog.service.impl;

import com.example.Car.catalog.models.dto.FuelTypeDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.models.entity.FuelType;
import com.example.Car.catalog.repository.FuelTypeRepository;
import com.example.Car.catalog.service.FuelTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FuelTypeServiceImpl implements FuelTypeService {
    private final FuelTypeRepository fuelTypeRepository;
    private final ModelMapper modelMapper;

    public FuelTypeServiceImpl(FuelTypeRepository fuelTypeRepository, ModelMapper modelMapper) {
        this.fuelTypeRepository = fuelTypeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<FuelType> findAllFuelTypes() {
        return fuelTypeRepository.findAll();
    }

    @Override
    public void addFuelType(FuelTypeDTO fuelTypeDTO) {
        FuelType fuelType = modelMapper.map(fuelTypeDTO, FuelType.class);
        fuelType.setName(fuelTypeDTO.getName());

        fuelTypeRepository.save(fuelType);
    }

    @Override
    public void removeFuelType(Long id) {
        fuelTypeRepository.deleteById(id);
    }

    @Override
    public Optional<FuelType> findById(Long id) {
        return fuelTypeRepository.findById(id);
    }

    @Override
    public void editFuelType(String name, Long id) {
        fuelTypeRepository.editFuelType(name, id);
    }
}
