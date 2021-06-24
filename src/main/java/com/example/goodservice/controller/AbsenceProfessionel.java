package com.example.goodservice.controller;

import com.example.goodservice.model.AbsenceEntity;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbsenceProfessionel {

    @Autowired
    private AbsenceService service;

    @PostMapping("/new/absence/{id}")
    public AbsenceEntity createNewAbs(@RequestBody AbsenceEntity absenceEntity,@PathVariable("id") ProfesionalEntity id)
    {
        return service.createNewAbs(absenceEntity, id);
    }

    @GetMapping("/absence/professional/{id}")
    public List<AbsenceEntity> getAbsenceByProId(@PathVariable("id") ProfesionalEntity id){
        return service.getAbsByIdPro(id);
    }

}
