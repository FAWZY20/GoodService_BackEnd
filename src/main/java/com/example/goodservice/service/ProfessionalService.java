package com.example.goodservice.service;

import com.example.goodservice.model.ProfesionalRegister;
import com.example.goodservice.repo.ProfesionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalService {

    @Autowired
    private ProfesionalRepository repo;

    public ProfesionalRegister saveProfessional(ProfesionalRegister profesionalRegister) {
        return repo.save(profesionalRegister);
    }

    public ProfesionalRegister fetchProfessionalByEmail(String email)
    {
        return repo.findByEmail(email);
    }

    public ProfesionalRegister fetchProfessionalByEmailAndMdp(String email, String mdp)
    {
        return repo.findUserByEmailAndMdp(email, mdp);
    }
}

