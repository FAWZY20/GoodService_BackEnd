CREATE TABLE utilisateur
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    email VARCHAR(255),
    pays VARCHAR(255),
    ville VARCHAR(255),
    code_postal VARCHAR(5),
)