create table customer
(
    id               uuid         not null,
    billing_address  jsonb        not null,
    delivery_address jsonb        not null,
    email            varchar(255) not null,
    name             varchar(255) not null,
    primary key (id)
);
