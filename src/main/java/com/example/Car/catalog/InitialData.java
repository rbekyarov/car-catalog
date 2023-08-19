package com.example.Car.catalog;

import com.example.Car.catalog.models.dto.*;
import com.example.Car.catalog.models.entity.Car;
import com.example.Car.catalog.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component

public class InitialData implements CommandLineRunner {

    private final BrandService brandService;
    private final ModelService modelService ;

    private final TransmissionService transmissionService ;

    private final FuelTypeService fuelTypeService;

    private final CarService carService;
    public InitialData(BrandService brandService, ModelService modelService, TransmissionService transmissionService, FuelTypeService fuelTypeService, CarService carService) {
        this.brandService = brandService;
        this.modelService = modelService;
        this.transmissionService = transmissionService;
        this.fuelTypeService = fuelTypeService;
        this.carService = carService;
    }

    @Override
    public void run(String... args) throws Exception {
        brandService.addBrand(new BrandDTO("AUDI"));
        brandService.addBrand(new BrandDTO("BMW"));
        brandService.addBrand(new BrandDTO("VW"));


        modelService.addModel(new ModelDTO("Q7", brandService.findById(1L).get()));
        modelService.addModel(new ModelDTO("X4", brandService.findById(2L).get()));
        modelService.addModel(new ModelDTO("Q5", brandService.findById(1L).get()));

        transmissionService.addTransmission(new TransmissionDTO("AUTOMATIC"));
        transmissionService.addTransmission(new TransmissionDTO("MANUAL"));
        transmissionService.addTransmission(new TransmissionDTO("HYBRID"));

        fuelTypeService.addFuelType(new FuelTypeDTO("GASOLINE"));
        fuelTypeService.addFuelType(new FuelTypeDTO("DIESEL"));
        fuelTypeService.addFuelType(new FuelTypeDTO("GAS"));
        fuelTypeService.addFuelType(new FuelTypeDTO("Electric"));

        carService.addCar(new CarDTO("BMW5V55Z",
                modelService.findById(2L).get(),
                new BigDecimal(50000), LocalDate.of(2023, 1, 1),
                transmissionService.findById(1L).get(),
                fuelTypeService.findById(1L).get(),
                "very impressive BMW X4 AUTOMATIC GASOLINE" ));

        carService.addCar(new CarDTO("AUDI5V55Z",
                modelService.findById(1L).get(),
                new BigDecimal(90000), LocalDate.of(2022, 11, 15),
                transmissionService.findById(2L).get(),
                fuelTypeService.findById(2L).get(),
                "very impressive AUDI Q7 MANUAL DIESEL" ));


        //Test searchByPrice
        System.out.println("//Test searchByPrice");
        for (Car car : carService.searchByPrice(new BigDecimal(50000))) {
            System.out.println(car);
        }

        //Test searchByModelName
        System.out.println("//Test searchByModelName");
        for (Car car : carService.searchByModel("Q7")) {
            System.out.println(car);
        }

        //Test searchByBrandName
        System.out.println("//Test searchByBrandName");
        for (Car car : carService.searchByBrand("BMW")) {
            System.out.println(car);
        }
        //Test searchByFuelTypeName
        System.out.println("//Test searchByFuelTypeName");
        for (Car car : carService.searchByFuelType("DIESEL")) {
            System.out.println(car);
        }
        //Test searchByByRegDate
        System.out.println("//Test searchByByRegDate");
        for (Car car : carService.searchByRegDate(LocalDate.of(2022, 11, 15))) {
            System.out.println(car);
        }
        //Test searchByByTransmissionType
        System.out.println("//Test searchByByTransmissionType");
        for (Car car : carService.searchByTransmissionType("AUTOMATIC")) {

            System.out.println(car);
        }

        //Test orderByPriceDesc
        System.out.println("//Test orderByPriceDesc");
        for (Car car : carService.orderByPriceDesc()) {

            System.out.println(car);
        }


    }
}
