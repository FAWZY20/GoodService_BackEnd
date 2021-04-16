CREATE TABLE utilisateur
(
    id SERIAL PRIMARY KEY,
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
<<<<<<< HEAD
(
=======

(
    id SERIAL PRIMARY KEY,
>>>>>>> 4ed86b1c5ba590d70f5da9e4c1af8748b427f049
    id INT PRIMARY KEY NOT NULL,
    poste VARCHAR(100),
    nom VARCHAR(100),
    prenom VARCHAR(100),
    Date_naissance DATE,
    siret VARCHAR(14),
    adresse VARCHAR(255),
    code_postal VARCHAR(5),
    ville VARCHAR (100),
    numero int,
    email VARCHAR(255),
    mdp VARCHAR(18)
<<<<<<< HEAD

)
=======
)
>>>>>>> 4ed86b1c5ba590d70f5da9e4c1af8748b427f049
