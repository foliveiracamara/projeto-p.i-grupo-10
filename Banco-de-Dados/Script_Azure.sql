CREATE TABLE Licenca (
idLicenca INT PRIMARY KEY IDENTITY,
tipo VARCHAR(45),
quantComputadores INT,
dataAquisicao DATETIME,
valor FLOAT);

CREATE TABLE Empresa (
idEmpresa INT PRIMARY KEY IDENTITY, 
nomeFantasia VARCHAR(100),
cnpj CHAR(14),
fkLicenca INT);

CREATE TABLE Endereco (
idEndereco INT PRIMARY KEY IDENTITY,
cep CHAR(8),
logadouro VARCHAR(100),
numero INT,
bairro VARCHAR(45),
complemento VARCHAR(30),
estado VARCHAR(100),
cidade VARCHAR(100),
fkEmpresa INT);

CREATE TABLE Contatos (
idContatos INT PRIMARY KEY IDENTITY,
telefoneEmpresa VARCHAR(11),
emailEmpresa VARCHAR(45),
fkEmpresa INT);

CREATE TABLE Usuario (
idUsuario INT PRIMARY KEY IDENTITY,
nomeUsuario VARCHAR(50),
emailUser VARCHAR(50),
senhaUser VARCHAR(50),
webhook VARCHAR(150),
fkEmpresa INT,
fkPermissao INT);

CREATE TABLE Permissao (
idPermissao INT PRIMARY KEY IDENTITY,
admin CHAR(1),
fkUsuario INT);

CREATE TABLE Periodo (
idPeriodo INT PRIMARY KEY IDENTITY,
mensal CHAR(1),
semestral CHAR(1),
anual CHAR(1));

CREATE TABLE Computadores (
idComputador INT PRIMARY KEY IDENTITY,
ipComputador VARCHAR(30),
hostName VARCHAR(30),
sistemaOperacional VARCHAR(20),
modeloProcessador VARCHAR(50),
idProcessador VARCHAR(30),
tamanhoDisco FLOAT,
tamanhoDiscoSecundario FLOAT,
tamanhoRam FLOAT,
fkUsuario INT);

CREATE TABLE Monitoramento (
idMonitoramento INT PRIMARY KEY IDENTITY,
processadorLogico INT,
processadorFisico INT,
usandoCpu FLOAT,
usandoDisco FLOAT,
usandoRam FLOAT,
dataHoraCaptura VARCHAR(19),
tempoLigada VARCHAR(15),
fkComputador INT);

CREATE TABLE Processo (
idProcesso INT PRIMARY KEY IDENTITY,
nomeProcesso VARCHAR(100),
usoCpu FLOAT,
usoMemoria FLOAT,
usoGpu FLOAT,
dataCaptura VARCHAR(19),
fkComputador INT);

CREATE TABLE Gamificacao (
idGamificacao INT PRIMARY KEY IDENTITY,
qtdPontos INT,
fkUsuario INT);

CREATE TABLE Ides (
idIdes INT PRIMARY KEY IDENTITY,
nome VARCHAR(50));

CREATE TABLE Frases (
idFrase INT PRIMARY KEY IDENTITY,
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