package com.example.goodservice.service;

import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.repo.ProfesionalRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private DTOMapper mapper;

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

    public List<ProfesionalEntity> getProfessional() {
        val entities = repo.findAll();
        return mapper.mapAsList(entities, ProfesionalEntity.class);
    }

    public ProfesionalEntity getProfessionalByCoiffeur(ProfesionalEntity poste) {
        return repo.professionalCoiffeur(poste);
    }
/*
    public List<ProfesionalEntity> getProfessionalByCity(UserEntity ville) {
        repo.getProfessionalByCity(ville);
    }

 */
}

