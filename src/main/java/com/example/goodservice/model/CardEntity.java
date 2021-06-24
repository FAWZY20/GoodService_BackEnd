package com.example.goodservice.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "card")
public class CardEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private UserEntity client;

    private String nom;

    private int numeroDeCarte;

    private Date dateExpiration;

    private  Integer cvc;

}
