create table produto(
    id varchar(100) not null primary key unique,
    nome varchar(100) NOT NULL ,
    preco NUMERIC(20, 2) NOT NULL,
    descricao varchar(1500),
    tipo varchar(50)

);