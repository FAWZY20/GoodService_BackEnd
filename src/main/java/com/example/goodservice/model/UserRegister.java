package com.example.goodservice.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String nom;

    @Column(nullable = false, length = 20)
    private String prenom;

    @Column(nullable = false,unique = true, length = 10)
    private Integer numero;

    @Column(nullable = false, unique = true, length = 45 )
    private String email;

    @Column(nullable = false, length = 50)
    private String adresse;

    @Column(nullable = false, length = 5)
    private String code_postal;

    @Column(nullable = false, length = 20)
    private String ville;

    @Column(nullable = false, length = 64)
    private String mdp;

    public UserRegister() {}

    public UserRegister(String nom, String prenom, Integer numero, String email, String adresse, String code_postal, String ville, String mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.email = email;
        this.adresse = adresse;
        this.code_postal = code_postal;
        this.ville = ville;
        this.mdp = mdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String cdp) {
        this.code_postal = cdp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
