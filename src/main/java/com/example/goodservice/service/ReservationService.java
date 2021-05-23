package com.example.goodservice.service;

import com.example.goodservice.model.DTO.ReservationDTO;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.repo.ReservationRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationService {

    @Autowired private ReservationRepository repository;

    @Autowired private DTOMapper mapper;


    public List<ReservationDTO> listCurrentUserReservations(){
       val entities = repository.findAll();//TODO use filtre by current user
        return mapper.mapAsList(entities, ReservationDTO.class);
    }

    public ReservationEntity reservationEntity(ReservationEntity reservationEntity) {
        return repository.save(reservationEntity);
    }
}
