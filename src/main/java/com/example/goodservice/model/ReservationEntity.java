package com.example.goodservice.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class ReservationEntity {

    @Id
    private int id;
    private int patient_id;
    private int profesional_id;
    private Date appointement_DateTime;
    private String etat;


}
