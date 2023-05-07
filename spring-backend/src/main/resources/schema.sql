DROP TABLE IF EXISTS "person";
CREATE TABLE "person"
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255) DEFAULT NULL,
    professor  BOOLEAN      DEFAULT FALSE
);

DROP TABLE IF EXISTS "class";
CREATE TABLE "class"
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    department    VARCHAR(255) NOT NULL,
    code          VARCHAR(7)   NOT NULL,
    professor_id  BIGINT REFERENCES "person"(id)
);

DROP TABLE IF EXISTS "class_person_mapping";
CREATE TABLE "class_person_mapping"
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY ,
    person_id  BIGINT REFERENCES "person"(id),
    class_id BIGINT REFERENCES "class"(id)
);
