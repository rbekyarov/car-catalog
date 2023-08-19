package com.example.Car.catalog.service;

import com.example.Car.catalog.models.dto.BrandDTO;
import com.example.Car.catalog.models.entity.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {

    List<Brand> findAllBrands();
    void addBrand(BrandDTO brandDTO);
    void removeBrand(Long id);
    Optional<Brand> findById(Long id);

    void editBrand(String name, Long id);

}
