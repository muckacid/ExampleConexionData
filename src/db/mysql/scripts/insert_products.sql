/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Laboratorio 2023
 * Created: 13 nov 2023
 */

CREATE TABLE(
    id int AUTO_INCREMENT,
    marca VARCHAR(20),
    tipo_id_fk int,
    
    PRIMARY KEY (id),
    FOREIGN KEY (tipo_id_fk) REFERENCES tipos(id)
);

INSERT INTO productos VALUES(null, "mckay", 1);
INSERT INTO productos VALUES(null, "pepsi", 2);

