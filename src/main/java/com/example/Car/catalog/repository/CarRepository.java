package com.example.Car.catalog.repository;


import com.example.Car.catalog.models.entity.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {



    @Transactional
    @Modifying
    @Query("update Car as c SET c.vinNumber = :vinNumber ,c.transmission.id = :transmissionId,c.remarks = :remarks,c.regDate = :regDate,c.price = :price, c.model.id = :modelId,c.fuelType.id = :fuelTypeId  where c.id=:id ")
    void editCar(@Param("vinNumber") String vinNumber,
                          @Param("transmissionId") Long transmissionId,
                          @Param("remarks") String remarks,
                          @Param("regDate") LocalDate regDate,
                          @Param("price") BigDecimal price,
                          @Param("modelId") Long modelId,
                          @Param("fuelTypeId") Long fuelTypeId,
                          @Param("id") Long id);
    @Query("select c from Car as c where c.price = :price")
    List<Car> findByPrice(@Param("price")BigDecimal price);
    @Query("select c from Car as c where c.model.name = :modelName")
    List<Car> findByModel(@Param("modelName")String modelName);
    @Query("select c from Car as c where c.model.brand.name = :brandName")
    List<Car> findByBrand(@Param("brandName")String brandName);
    @Query("select c from Car as c where c.fuelType.name = :fuelTypeName")
    List<Car> findByFuelTypeName(@Param("fuelTypeName")String fuelTypeName);
    @Query("select c from Car as c where c.regDate= :localDate")
    List<Car> findByRegDate(@Param("localDate")LocalDate localDate);
    @Query("select c from Car as c where c.transmission.name= :transmissionTypeName")
    List<Car> findByTransmissionType(@Param("transmissionTypeName")String transmissionTypeName);
    @Query("select c from Car as c order by c.price desc")
    List<Car> orderByPriceDesc();
}
