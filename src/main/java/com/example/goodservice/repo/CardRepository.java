package com.example.goodservice.repo;


import com.example.goodservice.model.CardEntity;
import com.example.goodservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {

    @Query("SELECT u FROM CardEntity u WHERE u.client= :id")
    List<CardEntity> findCardByUserId(UserEntity id);
}
