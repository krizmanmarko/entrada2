#!/bin/sh

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" -d "$POSTGRES_DB"  <<-EOSQL

     CREATE role $POSTGRES_ICEBERG_USER WITH LOGIN PASSWORD '$POSTGRES_ICEBERG_PASSWORD';
    
     CREATE DATABASE $POSTGRES_ICEBERG_DB WITH OWNER = $POSTGRES_ICEBERG_USER;
     
     GRANT connect ON DATABASE $POSTGRES_ICEBERG_DB TO $POSTGRES_ICEBERG_USER;
EOSQL