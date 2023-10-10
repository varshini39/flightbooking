-- Now create user with prop privileges
CREATE USER 'admin'@'%' IDENTIFIED BY 'admin123';

GRANT ALL PRIVILEGES ON * . * TO 'admin'@'%';

CREATE DATABASE  IF NOT EXISTS `flight_booking`;
