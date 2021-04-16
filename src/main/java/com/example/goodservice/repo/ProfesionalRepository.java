package com.example.goodservice.repo;

import com.example.goodservice.model.ProfesionalRegister;
import com.example.goodservice.model.UserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfesionalRepository extends JpaRepository<ProfesionalRegister, String>
{
    public ProfesionalRegister findByEmail(String email);
    public ProfesionalRegister findUserByEmailAndMdp(String email, String mdp);
}
