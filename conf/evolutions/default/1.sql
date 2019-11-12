# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table articulo (
  clave                         varchar(255) not null,
  descripcion                   varchar(255),
  grupo                         integer not null,
  unidad                        varchar(255),
  costo                         float not null,
  existencia                    integer not null,
  proveedor                     integer not null,
  constraint pk_articulo primary key (clave)
);

create table destinatario (
  id                            integer auto_increment not null,
  nombre                        varchar(255),
  direccion                     integer not null,
  ciudad                        varchar(255),
  telefono                      float not null,
  constraint pk_destinatario primary key (id)
);


# --- !Downs

drop table if exists articulo;

drop table if exists destinatario;

