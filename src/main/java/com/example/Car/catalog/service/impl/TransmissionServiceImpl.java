package com.example.Car.catalog.service.impl;

import com.example.Car.catalog.models.dto.TransmissionDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.models.entity.Transmission;
import com.example.Car.catalog.repository.TransmissionRepository;
import com.example.Car.catalog.service.TransmissionService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TransmissionServiceImpl implements TransmissionService {

    private final TransmissionRepository transmissionRepository;
    private final ModelMapper modelMapper;

    public TransmissionServiceImpl(TransmissionRepository transmissionRepository, ModelMapper modelMapper) {
        this.transmissionRepository = transmissionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Transmission> findAllTransmissions() {
        return transmissionRepository.findAll();
    }

    @Override
    public void addTransmission(TransmissionDTO transmissionDTO) {
        Transmission transmission = modelMapper.map(transmissionDTO, Transmission.class);
        transmission.setName(transmissionDTO.getName());

        transmissionRepository.save(transmission);
    }

    @Override
    public void removeTransmission(Long id) {
        transmissionRepository.deleteById(id);
    }

    @Override
    public Optional<Transmission> findById(Long id) {
        return transmissionRepository.findById(id);
    }

    @Override
    public void editTransmission(String name, Long id) {
        transmissionRepository.editTransmission(name, id);
    }
}
