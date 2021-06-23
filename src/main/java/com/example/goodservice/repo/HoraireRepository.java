package com.example.goodservice.repo;

import com.example.goodservice.DTO.ProfessionalLightDTO;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoraireRepository extends JpaRepository<HoraireEntity, Integer> {

    @Query("SELECT u FROM HoraireEntity u WHERE u.professional= :id")
    List<HoraireEntity> findHoraireByProID(ProfesionalEntity id);
}
