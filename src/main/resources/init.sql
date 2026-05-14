-- DROP DATABASE IF EXISTS dev_db;
-- CREATE DATABASE dev_db;
-- USE dev_db;

CREATE TABLE post(
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                     createDate DATETIME(6) NOT NULL,
                     modifyDate DATETIME(6) NOT NULL,
                     title CHAR(100) NOT NULL,
                     content TEXT NOT NULL,
                     PRIMARY KEY(id)
);

INSERT INTO post
SET createDate = now(6),
modifyDate = now(6),
title = '제목 1',
content = '내용 1';

INSERT INTO post
SET createDate = now(6),
modifyDate = now(6),
title = '제목 2',
content = '내용 2';
