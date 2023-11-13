/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Laboratorio 2023
 * Created: 13 nov 2023
 */


CREATE DATABASE ALMACEN;
USE ALMACEN;

CREATE TABLE tipos(
    id int AUTO_INCREMENT,
    tag VARCHAR(20),

    PRIMARY KEY(id)
);

CREATE TABLE productos(
    id int AUTO_INCREMENT,
    nombre VARCHAR(20),
    tipo_id_fk int,
    
    PRIMARY KEY (id),
    FOREIGN KEY (tipo_id_fk) REFERENCES tipos(id)
);

