DROP USER if exists 'springstudent'@'localhost';

CREATE USER 'springstudent'@'localhost' identified BY 'springstudent'; 

GRANT ALL privileges on * . * TO 'springstudent'@'localhost';

