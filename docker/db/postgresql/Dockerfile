FROM postgres:alpine3.15

ENV POSTGRES_USER shop_db
ENV POSTGRES_PASSWORD shop_db
ENV POSTGRES_DB shop_db

COPY docker/db/postgresql/postgresql_schema.sql /docker-entrypoint-initdb.d/
