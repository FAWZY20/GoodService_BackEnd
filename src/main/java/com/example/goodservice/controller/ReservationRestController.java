package com.example.goodservice.controller;

import com.example.goodservice.DTO.ReservationDTO;
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

   @GetMapping(value = "/{id}/list")
    public ReservationEntity reservationByIdUser(@PathVariable("id") UserEntity id)
    {
        return delegate.getReservationByIdUser(id);
    }

    @GetMapping(value = "/{id}/listprofesionel")
    public ReservationEntity reservationByIdProfessionel(@PathVariable("id") ProfesionalEntity id)
    {
        return delegate.getReservationByIdProfessionel(id);
    }

    @PostMapping("/new")
    public ReservationDTO createNewReservation(@RequestBody ReservationDTO dto)
    {
        return delegate.createNewReservation(dto);
    }

}
