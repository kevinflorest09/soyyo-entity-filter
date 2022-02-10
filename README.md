# Proyecto Consulta de entidades

El proyecto se puede ejecutar de la siguiente forma:

```
mvn spring-boot:run
```

O bien, mediante Docker:

```
docker build -t "co.com.soyyo.entity.filter-dev-1_0_0" .
docker run -d -it -p 8080:8080 --name=entity-filter-api entity-filter-api
```