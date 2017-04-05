CREATE TABLE NivelEscolar (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE Genero (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE Parentesco (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE TipoVivienda (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE TipoIdentificacion (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE CondicionSocial (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE CondicionFisica (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE Enfermedad (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE EstadoMujer (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));




CREATE TABLE EstadoCivil (
  id SERIAL  NOT NULL ,
  descripcion VARCHAR(255)    ,
  fecha TIMESTAMP      ,
PRIMARY KEY(id));





