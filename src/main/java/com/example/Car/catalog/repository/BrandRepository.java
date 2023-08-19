package com.example.Car.catalog.repository;

import com.example.Car.catalog.models.entity.Brand;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, java.lang.Long> {



    @Transactional
    @Modifying
    @Query("update Brand as b SET b.name = :name where b.id=:id ")
    void editBrand(@Param("name") String name,
                      @Param("id") java.lang.Long id);

}
