package com.example.goodservice.repo;


import com.example.goodservice.model.AbsenceEntity;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbscenceRepository extends JpaRepository<AbsenceEntity, Integer> {

    @Query("SELECT u FROM AbsenceEntity u WHERE u.professional= :id")
    List<AbsenceEntity> findAbsByProId(ProfesionalEntity id);

}
