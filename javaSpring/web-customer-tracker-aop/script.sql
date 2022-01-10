create table customer
(
    id         serial,
    first_name varchar,
    last_name  varchar,
    email      varchar
);

alter table customer
    owner to postgres;


