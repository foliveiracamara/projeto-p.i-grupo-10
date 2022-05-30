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
(null, 'Não é a linguagem de programação que define o programador, mas sim sua lógica.', 'David Ribeiro Guilherme'),
(null, 'Eu sou programador. \nEu não tenho vida.', 'Anônimo'),
(null, 'Programadores são ferramentas para converter cafeína em código.', 'Anônimo'),
(null, 'Ser desenvolvedor é uma viagem onde a próxima parada é a solução de um problema.', 'Thales Valentim'),
(null, 'Se até as variáveis precisam ser declaradas porque não me declarar pra você?', 'Hebert Barros'),
(null, 'A questão não é saber os códigos ou linhas de comando, é saber o que fazer com eles.', 'Sérgio Arena'),
(null, 'Faça da sua vida mais "Responsivo"', 'Luana Monteiro'),
(null, 'Linguagens não morrem mas sim seus programadores.', 'Thales de Oliveira Gomes'),
(null, 'Sou só um vírus, querendo escapar, dos programadores da vida.', 'Wesley D Amico'),
(null, 'Programadores e artistas são os únicos profissionais que tem como hobby a própria profissão.', 'Rafael Lain');