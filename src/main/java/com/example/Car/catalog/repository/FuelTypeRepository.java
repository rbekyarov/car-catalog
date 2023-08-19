package com.example.Car.catalog.repository;


import com.example.Car.catalog.models.entity.FuelType;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Long> {


    @Transactional
    @Modifying
    @Query("update FuelType as f SET f.name = :name where f.id=:id ")
    void editFuelType(@Param("name") String name,
                          @Param("id") Long id);
}
