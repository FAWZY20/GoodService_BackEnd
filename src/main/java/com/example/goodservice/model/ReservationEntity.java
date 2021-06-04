package com.example.goodservice.model;

import com.example.goodservice.DTO.ReservationStatus;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private UserEntity client;

    @ManyToOne
    private ProfesionalEntity professional;

    private String prestation;

    private Date appointementDate;

    private Time heure;

    private String address;

    private ReservationStatus etat;

}
