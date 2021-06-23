package com.example.goodservice.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "absence")
public class AbsenceEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private ProfesionalEntity professional;

    private String justificatif;

    private Date JourDeb;

    private Date JourFin;

}
