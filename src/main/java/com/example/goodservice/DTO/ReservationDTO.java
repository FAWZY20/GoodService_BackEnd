package com.example.goodservice.DTO;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class ReservationDTO {


    private int id;

    private UserLightDTO client;

    private ProfessionalLightDTO professional;

    private String prestation;

    private Date appointementDate;

    private Time heure;

    private String address;

    private ReservationStatus etat;

}
