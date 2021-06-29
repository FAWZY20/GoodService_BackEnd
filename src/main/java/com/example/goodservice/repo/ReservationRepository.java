package com.example.goodservice.repo;


import com.example.goodservice.DTO.ReservationDTO;
import com.example.goodservice.DTO.UserLightDTO;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer> {

    @Query("SELECT u FROM ReservationEntity u WHERE u.client= :id")
    List<ReservationEntity> findReservationByUserId(@Param("id") UserEntity id);

    @Query("SELECT u FROM ReservationEntity u WHERE u.professional= :id")
    List<ReservationEntity> findReservationByProfessionalId(@Param("id") ProfesionalEntity id);

    @Query("SELECT u FROM ReservationEntity u WHERE u.client= :id AND u.etat= 3 OR u.etat= 2")
    List<ReservationEntity> findReservationFinishOrRefusedByUserId(UserEntity id);

    @Query("SELECT u FROM ReservationEntity u WHERE u.professional= :id AND u.etat= 3 OR u.etat= 2")
    List<ReservationEntity> findReservationFinishOrRefusedByProId(ProfesionalEntity id);
}
