create table users
(
    id       int8 not null,
    email    text not null,
    username text not null,
    password text not null,
    primary key (id)
);

create sequence user_id_seq start 1 increment 1;
