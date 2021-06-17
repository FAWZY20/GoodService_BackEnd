package com.example.goodservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "utilisateur")
public class UserEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(nullable = false, length = 20)
    private String prenom;

    @Column(nullable = false, unique = true, length = 20)
    private String numero;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 50)
    private String adresse;

    @Column(nullable = false, length = 15)
    private String code_postal;

    @Column(nullable = false, length = 20)
    private String ville;

    @Column(nullable = false, length = 64)
    private String mdp;

}