CREATE DATABASE db_trabalho;

CREATE TABLE tbl_funcionario(
	nome VARCHAR(50) not null,
	cargo VARCHAR(20) not null,
	nascimento INT not null,
	taxa_presenca FLOAT not null,
	salario_base FLOAT not null,
	avaliacao FLOAT not null,
	
	PRIMARY KEY(nome)
)


/*TABELA DEPARTAMENTO*/

CREATE TABLE tbl_departamento(
	nome VARCHAR(50) NOT NULL,
	numero INT IDENTITY(1,1),
	rg_gerente INT NOT NULL,

	PRIMARY KEY(numero)
)

/*TABELA EMPREGADO*/

CREATE TABLE tbl_empregado(
	nome VARCHAR(50) NOT NULL,
	rg INT NOT NULL,
	cic INT NOT NULL,
	salario FLOAT NOT NULL,
	rg_superior INT,
	numero_departamento INT NOT NULL,

	FOREIGN KEY(numero_departamento) REFERENCES tbl_departamento(numero)
)

INSERT INTO tbl_funcionario (nome, cargo, nascimento, taxa_presenca, salario_base, avaliacao)
VALUES
('joao maria de jesus','administrativo',092378,80.2,10600, 8.7),
('Felipe dos Santos', 'Técnico', 110288, 90, 18200, 5.6),
('Maria José Silva', 'Técnico', 122390, 87.3, 15000, 4.5),
('José Silva', 'Administrativo', 122378, 60, 16200, 9.3),
('Mário Antunes', 'RH', 021177, 54.2, 8000, 7.2),
('Teresa Jardim', 'RH', 011380, 100, 4000, 7.7),
('Roberto Carlos Alves', 'RH', 121083, 23.64, 400, 7.7),
('Paulo Jardim', 'RH', 62845, 34.89, 30500, 10),
('Maria Eduarda Carvalho da Rosa', 'Administrativo', 083070, 90.78, 9000, 6.6),
('Pedro Henrique Teixeira', 'Técnico', 122378, 100, 7400, 7.2)


INSERT INTO tbl_departamento(nome, rg_gerente) VALUES
	('contabilidade',  10101010),
	('Engenharia civil', 30303030),
	('Engenharia mecânica', 20202020)

INSERT INTO tbl_empregado (nome, rg, cic, rg_superior, salario, numero_departamento)
	VALUES
	('João Luiz', 10101010, 11111111, NULL, 3.000, 1),
	('Fernando', 20202020, 22222222, 10101010, 2.500,2),
	('Ricardo', 30303030, 33333333, 10101010,  2.300,2),
	('Jorge', 40404040, 44444444,  20202020, 4.200, 2),
	('Renato', 50505050, 55555555, 20202020, 1.300, 3)


/* SELECT DE NOME, TAXA DE PRESENÇA E SALARIO BASE */
SELECT nome, 
	CAST(taxa_presenca AS VARCHAR) + '%' AS Taxa_Presença
	, 'R$' + CAST(salario_base AS VARCHAR) AS salario_base
FROM tbl_funcionario ORDER BY taxa_presenca DESC

/* SELECT EMPREGADO */
SELECT nome, SUBSTRING(CAST(rg AS VARCHAR), 1,2) +'.' + SUBSTRING(CAST(rg AS VARCHAR), 3,3) + '.' +  SUBSTRING(CAST(rg AS VARCHAR), 6,8) AS RG, SUBSTRING(CAST(cic AS VARCHAR), 1,3) + '.' + SUBSTRING(CAST(cic AS VARCHAR), 3,3) + '-' + SUBSTRING(CAST(cic AS VARCHAR), 7,8) AS CPF from tbl_empregado




DROP TABLE tbl_empregado

DROP DATABASE db_trabalho