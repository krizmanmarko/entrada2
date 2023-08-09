create table file_in (
    id serial not null,
    name varchar(255) not null,
    server varchar(255) not null,
    location varchar(255) not null,
    created timestamp not null,
    served timestamp,  
  	size int not null,
    CONSTRAINT file_in_pkey PRIMARY KEY (id)
);

CREATE UNIQUE INDEX IF NOT EXISTS idx_file_in_name ON file_in (name);
CREATE INDEX IF NOT EXISTS idx_file_in_created ON file_in (created);
CREATE INDEX IF NOT EXISTS idx_file_in_served ON file_in (served);

create table file_archive (
    id serial not null,
    name varchar(255) not null,
    server varchar(255) not null,
    location varchar(255) not null,
    created timestamp not null,
    served timestamp not null,
    size int not null,
    processed timestamp not null,
    rows int not null,
    time int not null,
    parquet_file varchar(255) not null,
    CONSTRAINT file_archive_pkey PRIMARY KEY (id)
);

CREATE UNIQUE INDEX IF NOT EXISTS idx_file_archive_name ON file_archive (name);