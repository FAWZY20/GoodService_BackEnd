package com.example.goodservice.service;

import com.example.goodservice.DTO.ReservationDTO;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.repo.ProfesionalRepository;
import com.example.goodservice.repo.ReservationRepository;
import com.example.goodservice.repo.UserRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReservationService {

    @Autowired private ReservationRepository reservationRepository;

    @Autowired private UserRepository userRepository;

    @Autowired private ProfesionalRepository professionalRepository;

    @Autowired private DTOMapper mapper;


    public List<ReservationDTO> getReservation(){
        val entities = reservationRepository.findAll();//TODO use filtre by current user
        return mapper.mapAsList(entities, ReservationDTO.class);
    }
    public List<ReservationEntity> getReservationByIdUser(UserEntity id){
        return reservationRepository.findReservationByUserId(id);
    }

    public List<ReservationEntity> getReservationByIdProfessionel(ProfesionalEntity id){
        return reservationRepository.findReservationByProfessionalId(id);
    }

    public ReservationDTO createNewReservation(ReservationDTO dto) {
        ReservationEntity entity = mapper.map(dto, ReservationEntity.class);

        val client = userRepository.getOne(dto.getClient().getId());
        entity.setClient(client);

        val professional = professionalRepository.getOne(dto.getProfessional().getId());
        entity.setProfessional(professional);

        entity = reservationRepository.save(entity);
        return mapper.map(entity, ReservationDTO.class);

    }

    public void updateReservation(ReservationDTO reservationDTO){
        val entity = reservationRepository.getOne(reservationDTO.getId());
        entity.setAppointementDate(reservationDTO.getAppointementDate());
        entity.setAddress(reservationDTO.getAddress());
        entity.setMessage(reservationDTO.getMessage());
        entity.setEtat(reservationDTO.getEtat());
    }

    public void delete(Integer id) {
        reservationRepository.deleteById(id);
    }

    public List<ReservationEntity> getReservationFinishByIdUser(UserEntity id) {
        return reservationRepository.findReservationFinishOrRefusedByUserId(id);
    }

    public List<ReservationEntity> getReservationFinishByIdPro(ProfesionalEntity id) {
        return reservationRepository.findReservationFinishOrRefusedByProId(id);
    }
}
