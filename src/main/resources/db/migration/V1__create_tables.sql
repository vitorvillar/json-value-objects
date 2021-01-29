CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table collection_customer
(
    id        uuid         not null default uuid_generate_v4(),
    addresses jsonb        not null,
    email     varchar(255) not null,
    name      varchar(255) not null,
    primary key (id)
);

create table reservation
(
    id             uuid  not null default uuid_generate_v4(),
    charge_package jsonb not null,
    primary key (id)
);

create table simple_customer
(
    id               uuid         not null default uuid_generate_v4(),
    billing_address  jsonb        not null,
    delivery_address jsonb        not null,
    email            varchar(255) not null,
    name             varchar(255) not null,
    primary key (id)
);