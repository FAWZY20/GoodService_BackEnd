package com.example.goodservice.controller;

import com.example.goodservice.model.DTO.ReservationDTO;
import com.example.goodservice.model.ReservationEntity;
import com.example.goodservice.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/api/reservation")
public class ReservationRestController {

    @Autowired private ReservationService delegate;

    @GetMapping("/ReservationUser")
    public List<ReservationDTO> list()
    {
        return delegate.listCurrentUserReservations();
    }

    @PostMapping(path = "/coiffure")
    public ReservationEntity reservationEntity(@RequestBody ReservationEntity reservation)
    {
        ReservationEntity userObj = null;
        userObj = (ReservationEntity) delegate.reservationEntity(reservation);
        return (ReservationEntity) userObj;
    }

}
