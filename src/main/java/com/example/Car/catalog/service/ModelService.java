package com.example.Car.catalog.service;
import com.example.Car.catalog.models.dto.ModelDTO;
import com.example.Car.catalog.models.dto.ModelEditDTO;
import com.example.Car.catalog.models.entity.Model;



import java.util.List;
import java.util.Optional;

public interface ModelService {

    List<Model> findAllModels();
    void addModel(ModelDTO modelDTO);
    void removeModel(Long id);
    Optional<Model> findById(Long id);

    void editModel(ModelEditDTO modelEditDTO, Long id);
}
