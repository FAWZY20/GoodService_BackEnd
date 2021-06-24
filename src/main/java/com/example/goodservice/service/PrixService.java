package com.example.goodservice.service;

import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.PrixEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.repo.PrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrixService {


    @Autowired
    private DTOMapper mapper;

    @Autowired
    private PrixRepository prixRepository;

    public PrixEntity createNewPrice(PrixEntity prix, ProfesionalEntity id) {
        prix.setProfessional(id);
        PrixEntity entity = mapper.map(prix, PrixEntity.class);
        entity = prixRepository.save(entity);
        return mapper.map(entity, PrixEntity.class);
    }

    public List<PrixEntity> getPriceByProId(ProfesionalEntity id) {
        return prixRepository.findPriceByProId(id);
    }
}
