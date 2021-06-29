package com.example.goodservice.repo;

import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfesionalRepository extends JpaRepository<ProfesionalEntity, Integer>
{
    public ProfesionalEntity findByEmail(String email);
    public ProfesionalEntity findUserByEmailAndMdp(String email, String mdp);

    @Query("SELECT p FROM ProfesionalEntity p WHERE p.ville= :ville AND p.poste= 'Coiffeur'")
    List<ProfesionalEntity> getProfessionalByCity( @Param("ville") String ville);

}
