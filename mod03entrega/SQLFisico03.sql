-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Cliente (
id_cliente INTEGER PRIMARY KEY auto_increment,
cpf INTEGER,
idade INTEGER,
email VARCHAR(10),
nome VARCHAR(50),
telefone VARCHAR(15),
endereco VARCHAR(50)
);

CREATE TABLE usuario (
id_usuario INTEGER PRIMARY KEY auto_increment,
nome VARCHAR(50),
email VARCHAR(50),
login VARCHAR(15),
senha VARCHAR(10),
tipo VARCHAR(10)
);

CREATE TABLE Viagem (
id_viagem INTEGER PRIMARY KEY auto_increment,
data DATETIME,
tipo VARCHAR(10),
duracao INTEGER,
viajantes INTEGER,
valor_viagem DECIMAL(15),
id_cliente INTEGER,
id_destino INTEGER,
id_estadia INTEGER,
FOREIGN KEY(id_cliente) REFERENCES Cliente (id_cliente)
);

CREATE TABLE Destino (
id_destino INTEGER PRIMARY KEY auto_increment,
pais VARCHAR(50),
provincia_estado VARCHAR(50),
cidade VARCHAR(50),
valor DECIMAL(15)
);

CREATE TABLE estadia (
id_estadia INTEGER PRIMARY KEY auto_increment,
nome_estadia VARCHAR(50),
tipo VARCHAR(50),
endereco VARCHAR(50),
telefone VARCHAR(10),
email VARCHAR(50),
valor DECIMAL(15)
);

CREATE TABLE Viajante (
id_viajante INTEGER PRIMARY KEY auto_increment,
nome_viajante VARCHAR(50),
cpf_viajante INTEGER,
idade_viajante INTEGER
);

CREATE TABLE ViagemViajante (
id_viagem_viajante INTEGER PRIMARY KEY auto_increment,
id_viagem INTEGER,
id_viajante INTEGER,
FOREIGN KEY(id_viagem) REFERENCES Viagem (id_viagem),
FOREIGN KEY(id_viajante) REFERENCES Viajante (id_viajante)
);

ALTER TABLE Viagem ADD FOREIGN KEY(id_destino) REFERENCES Destino (id_destino);
ALTER TABLE Viagem ADD FOREIGN KEY(id_estadia) REFERENCES estadia (id_estadia)