DROP SCHEMA IF EXISTS db  CASCADE;
CREATE SCHEMA db AUTHORIZATION pizzaslice;


create table users
(
    id bigserial not null
        constraint users_pk
            primary key,
    name varchar not null,
    address varchar not null,
    role integer default 1 not null,
    mobile varchar not null
);

alter table users owner to pizzaslice;

create unique index users_id_uindex
    on users (id);

create table orders
(
    id bigserial not null
        constraint orders_pk
            primary key,
    date_order date not null,
    date_finish date not null,
    price integer not null,
    address varchar not null,
    time integer,
    user_id integer
);

alter table orders owner to pizzaslice;

create unique index orders_id_uindex
    on orders (id);

create table pizzas
(
    id bigserial not null
        constraint pizzas_pk
            primary key,
    name varchar not null,
    price integer not null,
    order_id integer
);

alter table pizzas owner to pizzaslice;

create unique index pizzas_id_uindex
    on pizzas (id);

create table ingredients
(
    id bigserial not null
        constraint ingredients_pk
            primary key,
    name varchar not null,
    pizza_id integer
);

alter table ingredients owner to pizzaslice;

create unique index ingredients_id_uindex
    on ingredients (id);

create table extras
(
    id bigserial not null
        constraint extras_pk
            primary key,
    name varchar not null,
    price integer not null,
    order_id integer
);

alter table extras owner to pizzaslice;

create unique index extras_id_uindex
    on extras (id);

create table ingredients_pizza
(
    id bigserial not null
        constraint ingredients_pizza_pk
            primary key,
    fk_ingredient bigint
        constraint ingredients_pizza_ingredients_id_fk
            references ingredients,
    fk_pizza bigint
        constraint ingredients_pizza_pizzas_id_fk
            references pizzas
);

alter table ingredients_pizza owner to pizzaslice;

create unique index ingredients_pizza_id_uindex
    on ingredients_pizza (id);

create table order_pizza_extras
(
    fk_pizza integer not null
        constraint order_pizza_extras_pizzas_id_fk
            references pizzas,
    fk_order integer not null
        constraint order_pizza_extras_orders_id_fk
            references orders,
    fk_extras integer
        constraint order_pizza_extras_extras_id_fk
            references extras,
    id serial not null
        constraint order_pizza_extras_pk
            primary key
);

alter table order_pizza_extras owner to pizzaslice;

create unique index order_pizza_extras_id_uindex
    on order_pizza_extras (id);

