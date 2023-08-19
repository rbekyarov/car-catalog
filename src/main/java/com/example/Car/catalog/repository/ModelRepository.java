package com.example.Car.catalog.repository;


import com.example.Car.catalog.models.entity.Model;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {


    @Transactional
    @Modifying
    @Query("update Model as m SET m.name = :name, m.brand=:brandId  where m.id=:id ")
    void editModel(@Param("name") String name,
                   @Param("brandId") Long brandId,
                   @Param("id") Long id);
}
