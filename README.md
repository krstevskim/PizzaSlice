# PizzaSlice
Online Pizza shop for Korisnicki Interfejsi

![Logo](https://github.com/krstevskim/PizzaSlice/blob/master/logo.jpg)

How To:

1. Install postgresql(with password postgres or remember it)
2. If on windows add pathToInstall/bin to env variables -> user vars -> Path -> Edit
3. open cmd/terminal in project folder and execute following
```
psql -U postgres
#enter the password you used for install

create user pizzaslice with superuser password 'pizzaslice';
create database pizzaslice_v1 with owner pizzaslice;
\q

psql -U pizzaslice -d pizzaslice_v1 < ddl.sql
#enter password
\q
```
4. Install Node.JS and NPM
5. Open terminal in project folder
```
cd PizzaSlice-fe
npm install
```

6. In File -> Project Structure change JDK to Java 11 and Language Level to 11
7. Gradle should automatically be detected and run its build
8. To Start Spring use intellij
9. to run Angular do `npm start` in PizzaSlice-fe
