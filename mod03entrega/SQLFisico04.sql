-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Destino (
pais VARCHAR(100),
provincia_estado VARCHAR(100),
cidade VARCHAR(100),
valor DECIMAL(15),
id_destino INTEGER PRIMARY KEY
);

CREATE TABLE estadia (
nome_estadia VARCHAR(100),
tipo VARCHAR(15),
endereco VARCHAR(100),
telefone VARCHAR(15),
email VARCHAR(50),
valor DECIMAL(15),
id_estadia INTEGER PRIMARY KEY
);

CREATE TABLE Viajante (
nome_viajante VARCHAR(100),
idade_viajante INTEGER,
cpf_viajante VARCHAR(12),
id_viajante INTEGER PRIMARY KEY
);

CREATE TABLE Viagem (
tipo VARCHAR(10),
duracao INTEGER,
data DATETIME,
viajantes INTEGER,
valor_viagem DECIMAL(15),
id_viagem INTEGER PRIMARY KEY,
id_usuario INTEGER,
id_destino INTEGER,
id_estadia INTEGER,
FOREIGN KEY(id_destino) REFERENCES Destino (id_destino),
FOREIGN KEY(id_estadia) REFERENCES estadia (id_estadia)
);

CREATE TABLE Usuario (
idade INTEGER,
email VARCHAR(50),
nome VARCHAR(100),
telefone VARCHAR(15),
endereco VARCHAR(100),
cpf VARCHAR(12),
senha VARCHAR(15),
tipo VARCHAR(10),
id_usuario INTEGER PRIMARY KEY
);

CREATE TABLE ViagemViajante (
id_viajante INTEGER,
id_viagem INTEGER,
FOREIGN KEY(id_viajante) REFERENCES Viajante (id_viajante),
FOREIGN KEY(id_viagem) REFERENCES Viagem (id_viagem)
);

ALTER TABLE Viagem ADD FOREIGN KEY(id_usuario) REFERENCES Usuario (id_usuario)
