CREATE DATABASE PRODUTOBD;


CREATE TABLE PRODUTOBD.IMOVEIS (
ID           BIGINT        NOT NULL AUTO_INCREMENT,
CEP         VARCHAR(100)  NOT NULL,
ENDEREÇO   VARCHAR(1000) NULL,
COMPLEMENTO VARCHAR (100) NULL,
CIDADE VARCHAR (100) NULL,
ESTADO VARCHAR (100) NULL,
COMODOS   VARCHAR(3)           NOT NULL DEFAULT 0,
SUITES    VARCHAR(3)        NOT NULL DEFAULT 0,
DORMITORIOS   VARCHAR(3)         NOT NULL DEFAULT 0,
 VALOR VARCHAR(10)   NULL,
  DT_CADASTRO  TIMESTAMP     NOT NULL,
  CONSTRAINT PK_IMOVEIS PRIMARY KEY (ID)
);

SELECT * FROM PRODUTOBD.IMOVEIS
DROP TABLE PRODUTOBD.IMOVEIS

CREATE TABLE PRODUTOBD.FUNCIONARIOS (
ID           BIGINT        NOT NULL AUTO_INCREMENT,
NOME         VARCHAR(60)   NULL,
RG    VARCHAR(17)          NULL ,
CPF VARCHAR (17) NULL,
FILIAL VARCHAR (100) NULL,
CARGO VARCHAR (100) NULL,
  DT_CADASTRO  TIMESTAMP     NOT NULL,
  CONSTRAINT PK_FUNCIONARIOS  PRIMARY KEY (ID)
);


SELECT * FROM PRODUTOBD.FUNCIONARIOS



INSERT INTO PRODUTOBD.FUNCIONARIOS(NOME,RG,CPF,FILIAL,CARGO) VALUES("a","a","a","a","a")








