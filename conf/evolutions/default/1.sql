# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bar (
  id                        bigint not null,
  modified                  timestamp not null,
  version                   integer not null,
  constraint pk_bar primary key (id))
;

create table user (
  type                      varchar(31) not null,
  id                        bigint not null,
  modified                  timestamp not null,
  version                   integer not null,
  bar_id                    bigint,
  constraint pk_user primary key (id))
;

create sequence bar_seq;

create sequence user_seq;

alter table user add constraint fk_user_bar_1 foreign key (bar_id) references bar (id) on delete restrict on update restrict;
create index ix_user_bar_1 on user (bar_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bar;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bar_seq;

drop sequence if exists user_seq;

