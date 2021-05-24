package com.example.goodservice.model.DTO;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class ReservationDTO {


    private int id;
    private int patient_id;
    private int profesional_id;
    private String prestation;
    private Date appointement_DateTime;
    private Time heure;
    private String address;
    private String etat;

}
