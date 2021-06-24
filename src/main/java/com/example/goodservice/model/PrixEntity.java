package com.example.goodservice.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "prix")
public class PrixEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private ProfesionalEntity professional;

    private String prestation;

    private String prix;

}
