create table users
(
    id       bigserial not null,
    email    text      not null,
    username text      not null,
    password text      not null,
    primary key (id)
);
