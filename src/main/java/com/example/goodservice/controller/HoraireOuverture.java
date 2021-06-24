package com.example.goodservice.controller;

import com.example.goodservice.DTO.ProfessionalLightDTO;
import com.example.goodservice.DTO.ReservationDTO;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.service.HoraireService;
import com.example.goodservice.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HoraireOuverture {

    @Autowired
    private HoraireService service;

    @PostMapping("/new/horaire/{id}")
    public HoraireEntity createNewHoraire(@RequestBody HoraireEntity horaire, @PathVariable("id") ProfesionalEntity id)
    {
        return service.createNewHoraire(horaire,id);
    }

    @GetMapping("/horaire/professional/{id}")
    public List<HoraireEntity> getHoraireByProId(@PathVariable("id") ProfesionalEntity id){
        return service.getHoraireByProId(id);
    }

    @PutMapping("/horaire/edit")
    public void uptadeAppointment(@RequestBody HoraireEntity horaireEntity) {
        service.updateHoraire(horaireEntity);
    }

    @DeleteMapping("/horaire/{id}/delete")
    public void deleteCard(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}
