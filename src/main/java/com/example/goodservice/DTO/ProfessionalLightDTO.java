package com.example.goodservice.DTO;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class ProfessionalLightDTO {

    private Integer id;

    private String poste;

    private String nom;

    private String prenom;

    private Date date_naissance;

    private String siret;

    private String ville;

    private String latitude;

    private String longitude;

    private Integer numero;

    private String email;


}
