# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bar (
  id                        bigint not null,
  constraint pk_bar primary key (id))
;

create table foo_user (
  id                        bigint not null,
  bar_id                    bigint,
  constraint pk_foo_user primary key (id))
;

create sequence bar_seq;

create sequence foo_user_seq;

alter table foo_user add constraint fk_foo_user_bar_1 foreign key (bar_id) references bar (id) on delete restrict on update restrict;
create index ix_foo_user_bar_1 on foo_user (bar_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bar;

drop table if exists foo_user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bar_seq;

drop sequence if exists foo_user_seq;

