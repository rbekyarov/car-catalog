package com.example.Car.catalog.repository;


import com.example.Car.catalog.models.entity.Transmission;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepository extends JpaRepository<Transmission, Long> {



    @Transactional
    @Modifying
    @Query("update Transmission as t SET t.name = :name where t.id=:id ")
    void editTransmission(@Param("name") String name,
                   @Param("id") Long id);
}
