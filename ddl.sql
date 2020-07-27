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
	promo varchar,
	fk_user bigint not null
		constraint orders_users_id_fk
			references db.users
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
	price integer not null
);

alter table db.pizzas owner to pizzaslice;

create unique index pizzas_id_uindex
	on db.pizzas (id);

create table db.ingredients
(
	id bigserial not null
		constraint ingredients_pk
			primary key,
	name varchar not null
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
	price integer not null
);

alter table db.extras owner to pizzaslice;

create unique index extras_id_uindex
	on db.extras (id);

create table db.extras_pizza
(
	id bigserial not null
		constraint extras_pizza_pk
			primary key,
	fk_extra bigint
		constraint extras_pizza_extras_id_fk
			references db.extras,
	fk_pizza bigint
		constraint extras_pizza_pizzas_id_fk
			references db.pizzas
);

alter table db.extras_pizza owner to pizzaslice;

create unique index extras_pizza_id_uindex
	on db.extras_pizza (id);

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

create table db.order_pizza
(
	id bigserial not null
		constraint order_pizza_pk
			primary key,
	fk_pizza bigint
		constraint order_pizza_pizzas_id_fk
			references db.pizzas,
	fk_order bigint
		constraint order_pizza_orders_id_fk
			references db.orders
);

alter table db.order_pizza owner to pizzaslice;

create unique index order_pizza_id_uindex
	on db.order_pizza (id);

