use anotacao;
create table texto_usuario (
  texto_id bigint unsigned not null auto_increment,
  texto_nome varchar(20) not null,
  texto_senha varchar(150) not null,
  primary key (texto_id),
  unique key uni_usuario_nome (texto_nome)
);
