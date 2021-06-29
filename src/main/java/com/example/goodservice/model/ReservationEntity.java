package com.example.goodservice.model;

import com.example.goodservice.DTO.ReservationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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

    @JsonDeserialize(using = ProfesionalJsonDeserializer.class)
    @ManyToOne
    private ProfesionalEntity professional;

    private String prestation;

    private Date appointementDate;

    private String address;

    @Column(length = 32, columnDefinition = "varchar(32) default 'Encour'")
    @Enumerated(value = EnumType.STRING)
    private ReservationStatus etat = ReservationStatus.Encour;

    private String message;


}
