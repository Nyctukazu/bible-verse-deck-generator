CREATE TABLE verses (
    id              BIGSERIAL PRIMARY KEY,
    book            VARCHAR(20)  NOT NULL,
    chapter         INTEGER      NOT NULL,
    verse_number    INTEGER      NOT NULL,
    text            TEXT         NOT NULL,
    CONSTRAINT uq_verse_reference UNIQUE (book, chapter, verse_number)
);

CREATE INDEX idx_verse_lookup ON verses (book, chapter, verse_number);

