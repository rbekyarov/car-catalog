package com.example.Car.catalog.service.impl;

import com.example.Car.catalog.models.dto.ModelDTO;
import com.example.Car.catalog.models.dto.ModelEditDTO;
import com.example.Car.catalog.models.entity.Model;
import com.example.Car.catalog.repository.ModelRepository;
import com.example.Car.catalog.service.ModelService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;

    public ModelServiceImpl(ModelRepository modelRepository, ModelMapper modelMapper) {
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Model> findAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public void addModel(ModelDTO modelDTO) {
        Model model = modelMapper.map(modelDTO, Model.class);
        modelRepository.save(model);
    }

    @Override
    public void removeModel(Long id) {
        modelRepository.deleteById(id);
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelRepository.findById(id);
    }

    @Override
    public void editModel(ModelEditDTO modelEditDTO, Long id) {
        Long brandId = modelEditDTO.getBrandId();
        String name = modelEditDTO.getName();
        modelRepository.editModel(name,brandId,id);
    }
}
