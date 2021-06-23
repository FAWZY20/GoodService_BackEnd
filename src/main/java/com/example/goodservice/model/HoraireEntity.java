package com.example.goodservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
@Table(name = "horaire")
public class HoraireEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private ProfesionalEntity professional;

    private String jour;

    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = SqlTimeDeserializer.class)
    private Time heureDeb;

    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = SqlTimeDeserializer.class)
    private Time heureFin;
}
