/***********************************************************
* Create the database named memberdb and all of its tables
************************************************************/

DROP DATABASE IF EXISTS memberdb;
CREATE DATABASE memberdb;
USE memberdb;

CREATE TABLE Member (
	MemberID INT NOT NULL AUTO_INCREMENT,
	FullName VARCHAR(50),
	EmailAddress VARCHAR(50),
	PhoneNumber VARCHAR(20),
	ProgramName VARCHAR(20),
	YearLevel INT,
	PRIMARY KEY(MemberID) 
);

INSERT INTO Member 
  (FullName, EmailAddress, PhoneNumber, ProgramName, YearLevel)
VALUES 
  ('John Smith', 'jsmith@gmail.com', '111-111-1111', 'CPA', 1),
  ('Mary Smith', 'msmith@yahoo.com', '222-222-2222', 'CP', 2);
  
-- Create murach_user and grant privileges

DELIMITER //
CREATE PROCEDURE drop_user_if_exists()
BEGIN
    DECLARE userCount BIGINT DEFAULT 0 ;

    SELECT COUNT(*) INTO userCount FROM mysql.user
    WHERE User = 'mvsp' and  Host = 'localhost';

    IF userCount > 0 THEN
        DROP USER mvsp@localhost;
    END IF;
END ; //
DELIMITER ;

CALL drop_user_if_exists() ;

CREATE USER mvsp@localhost IDENTIFIED BY 'sesame';

GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP
ON memberdb.*
TO mvsp@localhost;

use memberdb;