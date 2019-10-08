DROP TABLE IF EXISTS user;
CREATE TABLE user
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name  VARCHAR(255) NOT NULL,
    email      VARCHAR(255) DEFAULT NULL,
    professor  BOOLEAN      DEFAULT FALSE
);

DROP TABLE IF EXISTS class;
CREATE TABLE class
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    department    VARCHAR(255) NOT NULL,
    code          VARCHAR(7)   NOT NULL,
    professor_id  BIGINT REFERENCES user(id)
);

DROP TABLE IF EXISTS class_user_mapping;
CREATE TABLE class_user_mapping
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY ,
    user_id  BIGINT REFERENCES user(id),
    class_id BIGINT REFERENCES class(id)
);
