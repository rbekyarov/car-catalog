package com.example.Car.catalog.service.impl;

import com.example.Car.catalog.models.dto.BrandDTO;
import com.example.Car.catalog.models.entity.Brand;
import com.example.Car.catalog.repository.BrandRepository;
import com.example.Car.catalog.service.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;
    private final ModelMapper modelMapper;

    public BrandServiceImpl(BrandRepository brandRepository, ModelMapper modelMapper) {
        this.brandRepository = brandRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public void addBrand(BrandDTO brandDTO) {


        Brand brand = modelMapper.map(brandDTO, Brand.class);
        brand.setName(brandDTO.getName());

        brandRepository.save(brand);
    }

    @Override
    public void removeBrand(java.lang.Long id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Optional<Brand> findById(java.lang.Long id) {
        return brandRepository.findById(id);
    }

    @Override
    public void editBrand(String name, Long id) {
        brandRepository.editBrand(name, id);
    }


}
