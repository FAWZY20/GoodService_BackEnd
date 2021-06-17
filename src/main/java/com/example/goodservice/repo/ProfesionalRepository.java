package com.example.goodservice.repo;

import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfesionalRepository extends JpaRepository<ProfesionalEntity, Integer>
{
    public ProfesionalEntity findByEmail(String email);
    public ProfesionalEntity findUserByEmailAndMdp(String email, String mdp);

    @Query("SELECT u FROM ProfesionalEntity u WHERE u.poste= :poste")
    ProfesionalEntity professionalCoiffeur(@Param("poste") ProfesionalEntity poste);
/*
    @Query("SELECT p FROM ProfesionalEntity p JOIN p. u WHERE u.ville= :ville")
    ProfesionalEntity getProfessionalByCity(@Param("ville") UserEntity ville);

*/

}
