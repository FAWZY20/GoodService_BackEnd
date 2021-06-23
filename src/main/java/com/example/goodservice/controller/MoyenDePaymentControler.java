package com.example.goodservice.controller;

import com.example.goodservice.model.CardEntity;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.ProfesionalEntity;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoyenDePaymentControler {

    @Autowired
    private CardService cardService;

    @PostMapping("/new/card")
    public CardEntity createNewCard(@RequestBody CardEntity card)
    {
        return cardService.createNewCard(card);
    }

    @GetMapping("/moyen/payment/{id}")
    public List<CardEntity> getCardByUserId(@PathVariable("id") UserEntity id){
        return cardService.getCardByUserId(id);
    }
}
