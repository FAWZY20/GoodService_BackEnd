package com.example.goodservice.service;

import com.example.goodservice.model.AbsenceEntity;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.repo.AbscenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AbsenceService {

    @Autowired
    private DTOMapper mapper;

    @Autowired
    private AbscenceRepository abscenceRepository;

    public AbsenceEntity createNewAbs(AbsenceEntity absenceEntity, ProfesionalEntity id) {
        absenceEntity.setProfessional(id);
        AbsenceEntity entity = mapper.map(absenceEntity, AbsenceEntity.class);
        entity = abscenceRepository.save(entity);
        return mapper.map(entity, AbsenceEntity.class);
    }


    public List<AbsenceEntity> getAbsByIdPro(ProfesionalEntity id) {
        return abscenceRepository.findAbsByProId(id);
    }
}
