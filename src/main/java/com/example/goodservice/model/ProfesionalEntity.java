package com.example.goodservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "professional")
public class ProfesionalEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 20)
    private String poste;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(nullable = false, length = 20)
    private String prenom;

    @Column(nullable = false)
    private Date date_naissance;

    @Column(nullable = false, length = 30)
    private String siret;

    @Column(nullable = false, length = 30)
    private String ville;

    @Column(nullable = false, length = 30)
    private String latitude;

    @Column(nullable = false, length = 30)
    private String longitude;

    @Column(nullable = false,unique = true, length = 10)
    private Integer numero;

    @Column(nullable = false, unique = true, length = 100 )
    private String email;

    @Column(nullable = false, length = 64)
    private String mdp;


}
