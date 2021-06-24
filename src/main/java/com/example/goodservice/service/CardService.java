package com.example.goodservice.service;

import com.example.goodservice.model.CardEntity;
import com.example.goodservice.model.HoraireEntity;
import com.example.goodservice.model.UserEntity;
import com.example.goodservice.repo.CardRepository;
import com.example.goodservice.repo.HoraireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private DTOMapper mapper;

    @Autowired
    private CardRepository cardRepository;


    public CardEntity createNewCard(CardEntity card, UserEntity id) {
        card.setClient(id);
        CardEntity entity = mapper.map(card, CardEntity.class);
        entity = cardRepository.save(entity);
        return mapper.map(entity, CardEntity.class);
    }


    public List<CardEntity> getCardByUserId(UserEntity id) {

        return cardRepository.findCardByUserId(id);
    }

    public void delete(Integer id) {
        cardRepository.deleteById(id);
    }
}
