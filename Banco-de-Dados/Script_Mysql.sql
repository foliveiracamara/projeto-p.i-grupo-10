CREATE DATABASE onhome;

USE onhome;

CREATE TABLE IF NOT EXISTS Licenca (
	idLicenca INT PRIMARY KEY AUTO_INCREMENT,
	tipo VARCHAR(45),
	quantComputadores INT,
	dataAquisicao DATETIME,
	valor DOUBLE
);

CREATE TABLE IF NOT EXISTS Empresa (
	idEmpresa INT PRIMARY KEY AUTO_INCREMENT, 
	nomeFantasia VARCHAR(100),
	cnpj CHAR(14),
	fkLicenca INT
);

CREATE TABLE IF NOT EXISTS Endereco (
	idEndereco INT PRIMARY KEY AUTO_INCREMENT,
	cep CHAR(8),
	logadouro VARCHAR(100),
	numero INT,
	bairro VARCHAR(45),
	complemento VARCHAR(30),
	estado VARCHAR(100),
	cidade VARCHAR(100),
	fkEmpresa INT
);

CREATE TABLE IF NOT EXISTS Contatos (
	idContatos INT PRIMARY KEY AUTO_INCREMENT,
	telefoneEmpresa VARCHAR(11),
	emailEmpresa VARCHAR(45),
	fkEmpresa INT
);

CREATE TABLE IF NOT EXISTS Especialidade (
	idEspecialidade INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Usuario (
	idUsuario INT PRIMARY KEY AUTO_INCREMENT,
	nomeUsuario VARCHAR(50),
	emailUser VARCHAR(50),
	senhaUser VARCHAR(50),
    webhook VARCHAR(150),
	fkEmpresa INT,
	fkPermissao INT,
	fkEspecialidade INT
);

CREATE TABLE IF NOT EXISTS Permissao (
	idPermissao INT PRIMARY KEY AUTO_INCREMENT,
	cargo VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Periodo (
	idPeriodo INT PRIMARY KEY AUTO_INCREMENT,
	periodo VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Computadores (
	idComputador INT PRIMARY KEY AUTO_INCREMENT,
    ipComputador VARCHAR(30),
	hostName VARCHAR(30),
	sistemaOperacional VARCHAR(20),
	modeloProcessador VARCHAR(50),
	idProcessador VARCHAR(30),
	tamanhoDisco DOUBLE,
	tamanhoDiscoSecundario DOUBLE,
	tamanhoRam DOUBLE,
	fkUsuario INT
);

CREATE TABLE IF NOT EXISTS Monitoramento (
	idMonitoramento INT PRIMARY KEY AUTO_INCREMENT,
	processadorLogico INT,
	processadorFisico INT,
	usandoCpu DOUBLE,
	usandoDisco DOUBLE,
	usandoRam DOUBLE,
	dataHoraCaptura VARCHAR(19),
	tempoLigada VARCHAR(15),
	fkComputador INT
);

CREATE TABLE IF NOT EXISTS Processo (
	idProcesso INT PRIMARY KEY AUTO_INCREMENT,
	nomeProcesso VARCHAR(100),
	usoCpu DOUBLE,
	usoMemoria DOUBLE,
	usoGpu DOUBLE,
	dataCaptura VARCHAR(19),
	fkComputador INT
);

CREATE TABLE IF NOT EXISTS Gamificacao (
	idGamificacao INT PRIMARY KEY AUTO_INCREMENT,
	qtdPontos INT,
	fkUsuario INT
);

CREATE TABLE IF NOT EXISTS Ides (
	idIdes INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Frases (
idFrase INT PRIMARY KEY AUTO_INCREMENT,
frase TEXT,
autor VARCHAR(70));

INSERT INTO Usuario(nomeUsuario, emailUser, senhaUser) VALUES ('admimOnHome', 'admin@onhome.com', 'admin@admin');

INSERT INTO Ides(nome) VALUES 
('eclipse'),
('Code'),
('pycharm'),
('netbeans64'),
('phpstorm'),
('webstorm'),
('atomo'),
('jira'),
('sonarqube'),
('docker'),
('kubernetes'),
('postgres'),
('mysqld'),
('java'),
('powershell'),
('cmd'),
('jenkins');

INSERT INTO Frases VALUES 
(null, 'N??o ?? a linguagem de programa????o que define o programador, mas sim sua l??gica.', 'David Ribeiro Guilherme'),
(null, 'Eu sou programador. \nEu n??o tenho vida.', 'An??nimo'),
(null, 'Programadores s??o ferramentas para converter cafe??na em c??digo.', 'An??nimo'),
(null, 'Ser desenvolvedor ?? uma viagem onde a pr??xima parada ?? a solu????o de um problema.', 'Thales Valentim'),
(null, 'Se at?? as vari??veis precisam ser declaradas porque n??o me declarar pra voc???', 'Hebert Barros'),
(null, 'A quest??o n??o ?? saber os c??digos ou linhas de comando, ?? saber o que fazer com eles.', 'S??rgio Arena'),
(null, 'Fa??a da sua vida mais "Responsivo"', 'Luana Monteiro'),
(null, 'Linguagens n??o morrem mas sim seus programadores.', 'Thales de Oliveira Gomes'),
(null, 'Sou s?? um v??rus, querendo escapar, dos programadores da vida.', 'Wesley D Amico'),
(null, 'Programadores e artistas s??o os ??nicos profissionais que tem como hobby a pr??pria profiss??o.', 'Rafael Lain');

select*from Monitoramento;
select*from Processo;
select*from Computadores;