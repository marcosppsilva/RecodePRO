-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Destino (
id_destino INTEGER PRIMARY KEY,
provincia_estado VARCHAR(100),
valor DECIMAL(15),
cidade VARCHAR(100),
pais VARCHAR(100)
)

CREATE TABLE estadia (
id_estadia INTEGER PRIMARY KEY,
endereco VARCHAR(100),
telefone VARCHAR(15),
valor DECIMAL(15),
email VARCHAR(50),
tipo VARCHAR(15),
nome_estadia VARCHAR(100)
)

CREATE TABLE Viagem (
id_viagem INTEGER PRIMARY KEY,
tipo VARCHAR(10),
duracao INTEGER,
valor_viagem DECIMAL(15),
viajantes INTEGER,
data DATETIME,
id_destino INTEGER,
id_estadia INTEGER,
FOREIGN KEY(id_destino) REFERENCES Destino (id_destino),
FOREIGN KEY(id_estadia) REFERENCES estadia (id_estadia)
)

CREATE TABLE Usuario (
id_usuario INTEGER PRIMARY KEY,
cpf VARCHAR(12),
email VARCHAR(50),
endereco VARCHAR(100),
tipo VARCHAR(10),
senha VARCHAR(15),
telefone VARCHAR(15),
idade INTEGER,
nome VARCHAR(100)
)

CREATE TABLE ViagemViajante (
id_usuario INTEGER,
id_viagem INTEGER,
FOREIGN KEY(id_usuario) REFERENCES Usuario (id_usuario),
FOREIGN KEY(id_viagem) REFERENCES Viagem (id_viagem)
)

