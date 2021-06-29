package com.example.goodservice.controller;

import com.example.goodservice.DTO.ReservationDTO;
import com.example.goodservice.DTO.UserLightDTO;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/api/reservation")
public class ReservationRestController {

    @Autowired private ReservationService delegate;

    @GetMapping("/list")
    public List<ReservationDTO> list()
    {
        return delegate.getReservation();
    }

   @GetMapping(value = "/list/{id}")
    public List<ReservationEntity> reservationByIdUser(@PathVariable("id") UserEntity id)
    {
        return delegate.getReservationByIdUser(id);
    }

    @GetMapping(value = "/list/fini/{id}")
    public List<ReservationEntity> reservationFinishByIdUser(@PathVariable("id") UserEntity id)
    {
        return delegate.getReservationFinishByIdUser(id);
    }

    @GetMapping(value = "/list/pro/fini/{id}")
    public List<ReservationEntity> reservationFinishByIdPro(@PathVariable("id") ProfesionalEntity id)
    {
        return delegate.getReservationFinishByIdPro(id);
    }

    @GetMapping(value = "/listprofesionel/{id}")
    public List<ReservationEntity> reservationByIdProfessionel(@PathVariable("id") ProfesionalEntity id)
    {
        return delegate.getReservationByIdProfessionel(id);
    }

    @PostMapping("/new/{id}")
    public ReservationEntity createNewReservationById(@RequestBody ReservationEntity reservation,@PathVariable("id") UserEntity id)
    {
        return delegate.createNewReservation(reservation,id);
    }

    @DeleteMapping("/reservation/{id}/delete")
    public void deleteReseravation(@PathVariable("id") Integer id) {
        delegate.delete(id);
    }

    @PutMapping("/reservation/edit")
    public void uptadeAppointment(@RequestBody ReservationDTO reservationDTO) {
        delegate.updateReservation(reservationDTO);
    }

}
