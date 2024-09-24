CREATE TABLE negozio (
    id_negozio BIGSERIAL PRIMARY KEY,
    nome_negozio VARCHAR(100) NOT NULL,
    indirizzo VARCHAR(255) NOT NULL,
    tipo_negozio VARCHAR(50) NOT NULL
);


CREATE TABLE negozio_config (
    id_negozio_config BIGSERIAL PRIMARY KEY,
    id_negozio BIGINT NOT NULL,
    nome_negozio VARCHAR(100) NOT NULL,
    sequenza_chiamata TEXT NOT NULL,
    id_chiamata INTEGER NOT NULL,
    api_call VARCHAR(500) NOT NULL,
    api_key VARCHAR(100) NOT NULL,
    valid CHAR(1) NOT NULL,
    CONSTRAINT fk_id_negozio
        FOREIGN KEY (id_negozio) 
        REFERENCES negozio (id_negozio)
        ON DELETE CASCADE
);


CREATE TABLE negozio_tipi (
    id_negozio_tipi BIGSERIAL PRIMARY KEY,
    id_negozio BIGINT NOT NULL,
    marchio VARCHAR(250) NOT NULL,
    CONSTRAINT fk_id_negozio
        FOREIGN KEY (id_negozio) 
        REFERENCES negozio (id_negozio)
        ON DELETE CASCADE
);
