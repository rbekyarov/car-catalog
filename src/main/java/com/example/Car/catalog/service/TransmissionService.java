package com.example.Car.catalog.service;

import com.example.Car.catalog.models.dto.TransmissionDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.models.entity.Transmission;

import java.util.List;
import java.util.Optional;

public interface TransmissionService {


    List<Transmission> findAllTransmissions();
    void addTransmission(TransmissionDTO transmissionDTO);
    void removeTransmission(Long id);
    Optional<Transmission> findById(Long id);

    void editTransmission(String name, Long id);
}
