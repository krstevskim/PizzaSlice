DROP SCHEMA IF EXISTS db  CASCADE;
CREATE SCHEMA db AUTHORIZATION pizzaslice;

create table db.users
(
    id bigserial not null
        constraint users_pk
            primary key,
    name varchar not null,
    address varchar not null,
    role integer default 1 not null,
    mobile varchar not null
);

alter table db.users owner to pizzaslice;

create unique index users_id_uindex
    on db.users (id);

create table db.orders
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

alter table db.orders owner to pizzaslice;

create unique index orders_id_uindex
    on db.orders (id);

create table db.pizzas
(
    id bigserial not null
        constraint pizzas_pk
            primary key,
    name varchar not null,
    price integer not null,
    order_id integer
);

alter table db.pizzas owner to pizzaslice;

create unique index pizzas_id_uindex
    on db.pizzas (id);

create table db.ingredients
(
    id bigserial not null
        constraint ingredients_pk
            primary key,
    name varchar not null,
    pizza_id integer
);

alter table db.ingredients owner to pizzaslice;

create unique index ingredients_id_uindex
    on db.ingredients (id);

create table db.extras
(
    id bigserial not null
        constraint extras_pk
            primary key,
    name varchar not null,
    price integer not null,
    order_id integer
);

alter table db.extras owner to pizzaslice;

create unique index extras_id_uindex
    on db.extras (id);

create table db.ingredients_pizza
(
    id bigserial not null
        constraint ingredients_pizza_pk
            primary key,
    fk_ingredient bigint
        constraint ingredients_pizza_ingredients_id_fk
            references db.ingredients,
    fk_pizza bigint
        constraint ingredients_pizza_pizzas_id_fk
            references db.pizzas
);

alter table db.ingredients_pizza owner to pizzaslice;

create unique index ingredients_pizza_id_uindex
    on db.ingredients_pizza (id);

create table db.order_pizza_extras
(
    fk_pizza integer not null
        constraint order_pizza_extras_pizzas_id_fk
            references db.pizzas,
    fk_order integer not null
        constraint order_pizza_extras_orders_id_fk
            references db.orders,
    fk_extras integer
        constraint order_pizza_extras_extras_id_fk
            references db.extras,
    id serial not null
        constraint order_pizza_extras_pk
            primary key
);

alter table db.order_pizza_extras owner to pizzaslice;

create unique index order_pizza_extras_id_uindex
    on db.order_pizza_extras (id);

