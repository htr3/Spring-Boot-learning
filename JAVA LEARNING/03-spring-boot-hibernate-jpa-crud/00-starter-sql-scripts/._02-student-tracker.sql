-- Create database if it doesn't exist
CREATE DATABASE IF NOT EXISTS student_tracker;

-- Use the student_tracker database
USE student_tracker;

-- Drop the student table if it exists
DROP TABLE IF EXISTS student;

-- Create the student table
CREATE TABLE student (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45) DEFAULT NULL,
    last_name VARCHAR(45) DEFAULT NULL,
    email VARCHAR(45) DEFAULT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
