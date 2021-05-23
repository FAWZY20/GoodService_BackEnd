package com.example.goodservice.model.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class ReservationDTO {


    private int id;
    private int patient_id;
    private int profesional_id;
    private Date appointement_DateTime;
    private String etat;

}
