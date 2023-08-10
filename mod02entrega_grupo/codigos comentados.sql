/*Altera tipo e tamanho de coluna em tabela*/
ALTER TABLE CLIENTE MODIFY COLUMN UF_CLI VARCHAR(2);

/*Seleciona o banco que pretende usar*/
use mercado;

/*Inserir somente um dado na linha que pretende*/
insert into cliente (nome_cli, endereco_cli, cidade_cli, cep_cli, uf_cli)
values ('João Antonio','Rua da Pedra, 145','Ponte Nova','35430-147','MG');

/*Inserir vários dados na tabela preenchendo várias linhas*/
insert into cliente (nome_cli, endereco_cli, cidade_cli, cep_cli, uf_cli)
values ('Maria José','Rua Salve Rainha, 5','Mariana','33400-227','MG'),
('Bernardo Santos','Rua do Crack, 25','Rio de Janeiro','21111-207','RJ');

insert into vendedor (id_vendedor, nome_vendedor, salario_vendedor, comissao)
values (1,'Gilmar', 2000, 10),
		(2,'Bigão', 1800, 5),
        (3,'Paulo', 1600, 3);