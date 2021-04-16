package com.example.goodservice.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "professional")
public class ProfesionalRegister {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(nullable = false, length = 20)
    private String poste;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(nullable = false, length = 20)
    private String prenom;

    @Column(nullable = false)
    private Date date_naissance;

    @Column(nullable = false, length = 18)
    private String siret;

    @Column(nullable = false, length = 50)
    private String adresse;

    @Column(nullable = false, length = 5)
    private String code_postal;

    @Column(nullable = false, length = 5)
    private String ville;

    @Column(nullable = false,unique = true, length = 10)
    private Integer numero;

    @Column(nullable = false, unique = true, length = 45 )
    private String email;

    @Column(nullable = false, length = 64)
    private String mdp;

    public ProfesionalRegister(){}

    public  ProfesionalRegister(String poste, String nom, String prenom, Date date_naissance, String siret, String adresse, String code_postal, String ville, Integer numero, String email, String mdp){
        this.poste=poste;
        this.nom=nom;
        this.prenom=prenom;
        this.date_naissance=date_naissance;
        this.siret=siret;
        this.adresse=adresse;
        this.code_postal=code_postal;
        this.ville=ville;
        this.numero=numero;
        this.email=email;
        this.mdp=mdp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
