CREATE TABLE utilisateur
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    numero int ,
    email VARCHAR(255),
    adresse VARCHAR(255),
    code_postal VARCHAR(5),
    ville VARCHAR(255),
    mdp VARCHAR(512) NOT NULL

)

CREATE TABLE professional
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    Date_naissance DATE,
    siret VARCHAR(14),
    adresse VARCHAR(255),
    code_postal VARCHAR(5),
    numero int,
    email VARCHAR(255),
    mdp VARCHAR(18)

)