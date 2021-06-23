package com.example.goodservice.service;

import com.example.goodservice.DTO.ProfessionalLightDTO;
import com.example.goodservice.DTO.ReservationDTO;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.repo.HoraireRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoraireService {

    @Autowired
    private DTOMapper mapper;

    @Autowired
    private HoraireRepository horaireRepository;

    public HoraireEntity createNewHoraire(HoraireEntity horaire) {
        HoraireEntity entity = mapper.map(horaire, HoraireEntity.class);
        entity = horaireRepository.save(entity);
        return mapper.map(entity, HoraireEntity.class);
    }

    public List<HoraireEntity> getHoraireByProId(ProfesionalEntity id) {

        return horaireRepository.findHoraireByProID(id);
    }

    public void updateHoraire(HoraireEntity horaireEntity) {
        val entity = horaireRepository.getOne(horaireEntity.getId());
        entity.setJour(horaireEntity.getJour());
        entity.setHeureDeb(horaireEntity.getHeureDeb());
        entity.setHeureFin(horaireEntity.getHeureFin());
    }
}
