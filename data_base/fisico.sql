-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Cliente (
Id_cliente VARCHAR(50) PRIMARY KEY,
Nome VARCHAR(50),
Email VARCHAR(50),
senha VARCHAR(10),
Telefone VARCHAR(30),
Id_contatenos VARCHAR(40)
);

CREATE TABLE Promoção (
Id_promoção VARCHAR(10) PRIMARY KEY,
Pacote VARCHAR(10),
Destinos VARCHAR(10)
);

CREATE TABLE Destino (
Valor VARCHAR(10),
Id_destino VARCHAR(10) PRIMARY KEY,
Data VARCHAR(10),
Cidades VARCHAR(10)
);

CREATE TABLE Contatenos (
Id_contatenos VARCHAR(10) PRIMARY KEY,
Nome VARCHAR(50),
Telefone VARCHAR(30),
Email VARCHAR(10),
Reclamação VARCHAR(10),
Estado VARCHAR(40)
);

CREATE TABLE Compra (
Id_destino VARCHAR(10),
Id_cliente VARCHAR(10),
Id_promoção VARCHAR(10),
PRIMARY KEY(Id_destino,Id_cliente,Id_promoção)
);

ALTER TABLE Cliente ADD FOREIGN KEY(Id_contatenos) REFERENCES Contatenos (Id_contatenos);
