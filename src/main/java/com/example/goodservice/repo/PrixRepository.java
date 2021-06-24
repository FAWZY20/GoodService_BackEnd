package com.example.goodservice.repo;

import com.example.goodservice.model.PrixEntity;
import com.example.goodservice.model.ProfesionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrixRepository extends JpaRepository<PrixEntity, Integer> {

    @Query("SELECT u FROM PrixEntity u WHERE u.professional= :id")
    List<PrixEntity> findPriceByProId(ProfesionalEntity id);
}
