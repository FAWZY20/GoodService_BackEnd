package com.example.goodservice.controller;

import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.PrixEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.service.HoraireService;
import com.example.goodservice.service.PrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PrestationPrixControler {

    @Autowired
    private PrixService service;

    @PostMapping("/new/price/{id}")
    public PrixEntity createNewPrice(@RequestBody PrixEntity prix, @PathVariable("id") ProfesionalEntity id)
    {
        return service.createNewPrice(prix,id);
    }

    @GetMapping("/prix/professional/{id}")
    public List<PrixEntity> getPriceByProId(@PathVariable("id") ProfesionalEntity id){
        return service.getPriceByProId(id);
    }
}
