drop table if exists TB_CLIENTE;
create table  TB_CLIENTE (
    COD_CLIENTE bigint generated by default as identity primary key,
    TX_NOME varchar(255) NOT NULL,
    TX_TELEFONE varchar(255) NOT NULL,
    TX_EMAIL varchar(255) NOT NULL
);