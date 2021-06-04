package com.example.goodservice.service;

import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.repo.ProfesionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalService {

    @Autowired
    private ProfesionalRepository repo;

    public ProfesionalEntity saveProfessional(ProfesionalEntity profesionalEntity) {
        return repo.save(profesionalEntity);
    }

    public ProfesionalEntity fetchProfessionalByEmail(String email)
    {
        return repo.findByEmail(email);
    }

    public ProfesionalEntity fetchProfessionalByEmailAndMdp(String email, String mdp)
    {
        return repo.findUserByEmailAndMdp(email, mdp);
    }
}

