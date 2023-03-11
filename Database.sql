-- CREATE DATABASE cs155_2l_db;

USE cs155_2l_db; -- LOCAL DB (Can be changed depending on ur db name)
USE sql12604574; -- REMOTE DB ONLY FOR DEBUGGING

CREATE TABLE AccountTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Username VARCHAR(100),
    Password VARCHAR(100),
    ContactNumber VARCHAR(20),
	EmailAddress VARCHAR(100)
);
SELECT * FROM AccountTable;
DROP TABLE AccountTable;


-- This will only have two default entries: Photocard and Photopaper
-- This will not be actively used but instead will only act as a constraint and a lookup table for product table
CREATE TABLE ProductTypeTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100)
);
DROP TABLE ProductTypeTable;
SELECT * FROM ProductTypeTable;

-- Table for Products Available under a specific product type
CREATE TABLE ProductTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    TypeId INT,
    Name VARCHAR(100),
    Sales_Multiplier DOUBLE,
    Profit_Multiplier DOUBLE,
    FOREIGN KEY (TypeId) REFERENCES ProductTypeTable(Id) ON DELETE CASCADE
);
DROP TABLE ProductTable;
SELECT * FROM ProductTable;

-- Table for Product Transaction Logs
CREATE TABLE ProductEntryTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    ProductId INT,
    FOREIGN KEY (ProductId) REFERENCES ProductTable(Id) ON DELETE CASCADE,
    Qty INT,
    EntryDate TIMESTAMP
);
DROP TABLE ProductEntryTable;
SELECT * FROM ProductEntryTable;



CREATE TABLE GoalTable (
	Id INT PRIMARY KEY AUTO_INCREMENT,
    Status INT,	-- By Default: Not Achieved (False)
    TargetSales DOUBLE, -- Set By User
    EntryDate TIMESTAMP,
    DeadlineDate TIMESTAMP
);
SELECT * FROM GoalTable;
INSERT INTO GoalTable VALUES (null, 0, 69.0, 0.0, "2023/03/10", "2023/12/21");
TRUNCATE GoalTable;
DROP TABLE GoalTable;






-- Test Data
INSERT INTO ProductTypeTable VALUES (null, "Photocard");
INSERT INTO ProductTypeTable VALUES (null, "Photopaper");
INSERT INTO ProductTable VALUES (null, 1, "Glossy", 10, 5);
INSERT INTO ProductTable VALUES (null, 1, "Canvas Matte", 12, 5);
INSERT INTO ProductTable VALUES (null, 1, "Leather", 12, 5);
INSERT INTO ProductTable VALUES (null, 1, "Glitter", 15, 10);
INSERT INTO ProductTable VALUES (null, 1, "3D", 15, 10);
INSERT INTO ProductTable VALUES (null, 1, "Broken Glass Holo", 18, 10);
INSERT INTO ProductTable VALUES (null, 1, "Holo", 18, 10);
INSERT INTO ProductTable VALUES (null, 2, "3R Satin", 18, 8);
INSERT INTO ProductTable VALUES (null, 2, "4R Satin", 25, 12);
INSERT INTO ProductTable VALUES (null, 2, "4R Glossy", 25, 12);
INSERT INTO ProductTable VALUES (null, 2, "4R Pearl Holo", 25, 11);
INSERT INTO ProductTable VALUES (null, 2, "5R Satin", 30, 15);
INSERT INTO ProductTable VALUES (null, 2, "A4 Glossy", 50, 25);
INSERT INTO ProductTable VALUES (null, 2, "A4 Satin", 50, 25);


INSERT INTO ProductEntryTable VALUES (null, 2, 20, "2023/3/4");
INSERT INTO ProductEntryTable VALUES (null, 1, 12, "2023/3/4");
INSERT INTO ProductEntryTable VALUES (null, 3, 10, "2023/3/4");
INSERT INTO ProductEntryTable VALUES (null, 3, 50, "2023/2/4");


-- Test Queries
-- General Query, just change value for ProductTypeTable.Name in WHERE clause  
SELECT 
	ProductTable.Id AS Id,
    ProductTypeTable.Name AS Type, 
    ProductTable.Name, 
    IFNULL(SUM(Qty), 0) AS Qty, 
    IFNULL(SUM(Qty*Sales_Multiplier), 0) AS Sales, 
    IFNULL(SUM(Qty*Profit_Multiplier), 0) AS Profit
FROM 
    ProductTable
    LEFT JOIN ProductEntryTable ON ProductTable.Id = ProductEntryTable.ProductId
    JOIN ProductTypeTable ON ProductTable.TypeId = ProductTypeTable.Id
WHERE
	ProductTypeTable.Name = ProductTypeTable.Name
GROUP BY 
    ProductTable.Id;


SELECT * FROM ProductTable WHERE TypeId=1;

SELECT
    IFNULL(SUM(Qty*Sales_Multiplier), 0) AS Sales
FROM 
    ProductTable
    LEFT JOIN ProductEntryTable ON ProductTable.Id = ProductEntryTable.ProductId
WHERE EntryDate > '2023/3/10';