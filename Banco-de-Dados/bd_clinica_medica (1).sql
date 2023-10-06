/* CREATE THE DATASBASE */
/* CREATE THE DATASBASE */
CREATE DATABASE db_clinica_medica;

/* DELETE THE DATABASE WRONG CASE */
DROP DATABASE db_clinica_medica;

/* CREATE PATIENT TABLE */
USE db_clinica_medica;
CREATE TABLE tbl_paciente(
	numeroBeneiciario int not null identity(1,1),
	nome varchar(40) not null,
	endereco varchar(100) not null,
	telefone varchar(18) not null,
	doencas_previas varchar(70) not null,
	remedio_uso_continuo varchar(60) not null,
	PRIMARY KEY(numeroBeneiciario)
)

/* CREATE SPECIALTY TABLE */
USE db_clinica_medica;
CREATE TABLE tbl_especialidade(
	numeroRegistro int not null identity(1,1),
	nomeEspecialidade varchar(42) not null,
	publicoAlvo varchar(50) not null,
	PRIMARY KEY(numeroRegistro)
)

/* CREATE SCHEDULING TABLE */
USE db_clinica_medica;
CREATE TABLE tbl_agendamento(
	numeroAgendamento int not null identity(1,1),
	dataAgendamento varchar(10) not null,
	horaAgendamento varchar(8) not null,
	queixa varchar(50) not null,
	gravidade varchar(10) not null,
	PRIMARY KEY(numeroAgendamento)
)

/* CREATE MEDIC TABLE */
USE db_clinica_medica;
CREATE TABLE tbl_medico(
	crm varchar(11) not null,
	nome_medico varchar(40) not null,
	endereco_medico varchar(100) not null,
	telefone varchar(18) not null,
	numeroEspecialidade int not null,
	PRIMARY KEY(crm)
	
)

/* CREATE CONSULTATION TABLE */
USE db_clinica_medica;
CREATE TABLE tbl_consulta(
	numeroConsulta int not null identity(1,1),
	dataConsulta date not null,
	hora datetime not null,
	crmMedico varchar(11) not null,
	idPaciente int not null,
	numeroAgendamento int not null,

	PRIMARY KEY(numeroConsulta),
	FOREIGN KEY(crmMedico) REFERENCES tbl_medico(crm),
	FOREIGN KEY(idPaciente) REFERENCES tbl_paciente(numeroBeneiciario),
	FOREIGN KEY(numeroAgendamento) REFERENCES tbl_agendamento(numeroAgendamento)
)

INSERT INTO tbl_paciente (nome, endereco, telefone, doencas_previas, remedio_uso_continuo)
VALUES
('Maria da Silva', 'Rua Principal, Cidadela', '(55) 1234-5678', 'Hipertensão', 'Lisinopril'),
('João Souza', 'Avenida das Palmeiras, Vila Feliz', '(55) 9876-5432', 'Diabetes', 'Metformina'),
('Ana Santos', 'Travessa Carvalho, Bairro Novo', '(55) 5555-5555', 'Asma', 'Salbutamol'),
('Carlos Fernandes', 'Rua dos Pinheiros, Vilarejo', '(55) 2222-3333', 'Doença Cardíaca', 'AAS'),
('Emily Oliveira', 'Alameda Cedro, Sítio Belo', '(55) 7777-8888', 'Nenhuma', 'Nenhum');

INSERT INTO tbl_especialidade (nomeEspecialidade, publicoAlvo)
VALUES
('Cardiologia', 'Adultos'),
('Pediatria', 'Crianças e Adolescentes'),
('Dermatologia', 'Todas as Idades'),
('Ortopedia', 'Adultos e Idosos'),
('Oncologia', 'Adultos');

INSERT INTO tbl_agendamento (dataAgendamento, horaAgendamento, queixa, gravidade)
VALUES
('2023-09-23', '10:00:00', 'Dor no peito', 'Alta'),
('2023-09-24', '14:30:00', 'Febre e tosse', 'Moderada'),
('2023-09-25', '09:15:00', 'Erupção cutânea', 'Baixa'),
('2023-09-26', '11:45:00', 'Braço fraturado', 'Alta'),
('2023-09-27', '15:20:00', 'Dor de cabeça', 'Moderada');

INSERT INTO tbl_medico (crm, nome_medico, endereco_medico, telefone, numeroEspecialidade)
VALUES
('MD12345', 'Dr. Sarah Johnson', 'Rua das Árvores, Plaza Médica', '(55) 3333-1111', 1),
('MD67890', 'Dr. David Lee', 'Avenida das Flores, Centro de Saúde', '(55) 4444-2222', 2),
('MD24680', 'Dra. Maria Rodriguez', 'Travessa dos Pinheiros, Prédio da Clínica', '(55) 8888-5555', 3),
('MD13579', 'Dr. Carlos Gomez', 'Rua do Carvalho, Torre do Hospital', '(55) 2222-9999', 4),
('MD98765', 'Dra. Emily Wilson', 'Alameda do Cedro, Centro Médico', '(55) 6666-7777', 5);

INSERT INTO tbl_consulta (dataConsulta, hora, crmMedico, idPaciente, numeroAgendamento)
VALUES
('2023-09-23', '10:30:00', 'MD12345', 1, 1),
( '2023-09-24', '14:45:00', 'MD67890', 2, 2),
('2023-09-25', '09:30:00', 'MD24680', 3, 3),
('2023-09-26', '12:00:00', 'MD13579', 4, 4),
('2023-09-27', '15:30:00', 'MD98765', 5, 5);


/*CONSULTATION ALL INFORMATION*/

SELECT * FROM tbl_medico;
SELECT * FROM tbl_paciente;
SELECT * FROM tbl_agendamento;
SELECT * FROM tbl_consulta;
SELECT * FROM tbl_especialidade;
