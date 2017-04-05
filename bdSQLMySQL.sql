CREATE TABLE NivelEscolar (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE Genero (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE Parentesco (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE TipoVivienda (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE TipoIdentificacion (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE CondicionSocial (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE CondicionFisica (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE Enfermedad (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE EstadoMujer (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;



CREATE TABLE EstadoCivil (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  descripcion VARCHAR(255)  NULL  ,
  fecha TIMESTAMP  NULL    ,
PRIMARY KEY(id))
TYPE=InnoDB;




