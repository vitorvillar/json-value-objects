create table collection_customer
(
    id        uuid         not null,
    addresses jsonb        not null,
    email     varchar(255) not null,
    name      varchar(255) not null,
    primary key (id)
)
create table reservation
(
    id             uuid  not null,
    charge_package jsonb not null,
    primary key (id)
)
create table simple_customer
(
    id               uuid         not null,
    billing_address  jsonb        not null,
    delivery_address jsonb        not null,
    email            varchar(255) not null,
    name             varchar(255) not null,
    primary key (id)
)
create table collection_customer (id uuid not null, addresses jsonb not null, email varchar(255) not null, name varchar(255) not null, primary key (id))
create table reservation (id uuid not null, charge_package jsonb not null, primary key (id))
create table simple_customer (id uuid not null, billing_address jsonb not null, delivery_address jsonb not null, email varchar(255) not null, name varchar(255) not null, primary key (id))
