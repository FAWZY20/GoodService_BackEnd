CREATE TABLE utilisateur
(
    id SERIAL PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    numero int ,
    email VARCHAR(255),
    adresse VARCHAR(255),
    code_postal VARCHAR(5),
    ville VARCHAR(255),
    mdp VARCHAR(18)

)

CREATE TABLE professional
(
    id SERIAL PRIMARY KEY,
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