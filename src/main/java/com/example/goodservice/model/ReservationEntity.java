package com.example.goodservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class ReservationEntity {

    @Id
    private int id;
    private int patient_id;
    private int profesional_id;
    private String prestation;
    private Date appointement_DateTime;
    private Time heure;
    private String address;
    private String etat;

}
