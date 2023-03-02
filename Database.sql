-- CREATE DATABASE cs155_2l_db;

USE cs155_2l_db; -- LOCAL DB (Can be changed depending on ur db name)
USE sql12602216; -- REMOTE DB ONLY FOR DEBUGGING

CREATE TABLE AccountTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Username VARCHAR(100),
    Password VARCHAR(100),
    ContactNumber VARCHAR(20),
	EmailAddress VARCHAR(100)
);

DROP TABLE AccountTable;

-- test queries
SELECT COUNT(Id) AS "Rows" FROM AccountTable;
SELECT * FROM AccountTable WHERE Username="aaaaaaaaaa" AND Password="a";
SELECT * FROM AccountTable;