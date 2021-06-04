package com.example.goodservice.repo;

import com.example.goodservice.model.ProfesionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfesionalRepository extends JpaRepository<ProfesionalEntity, Integer>
{
    public ProfesionalEntity findByEmail(String email);
    public ProfesionalEntity findUserByEmailAndMdp(String email, String mdp);
}
