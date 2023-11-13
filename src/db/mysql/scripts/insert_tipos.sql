0/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Laboratorio 2023
 * Created: 13 nov 2023
 */

CREATE TABLE tipos(
    id int AUTO_INCREMENT,
    tag VARCHAR(20),

    PRIMARY KEY(id)
);

INSERT INTO tipos VALUES(null, "galletas");
INSERT INTO tipos VALUES(null, "bebestible");
INSERT INTO tipos VALUES(null, "panes");
INSERT INTO tipos VALUES(null, "fiambres");
INSERT INTO tipos VALUES(null, "frituras");

