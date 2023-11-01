use bd_picafresa;
-- -------------------------------------------INSERTAR EN USUARIO ------------------------
INSERT INTO Usuario (Usuario,contraseña,tipo_usuario,RFC_usuario,Nombre_usuario) VALUES ('Roberto','1234','Gerente','MSOFPW3RER','rob');
INSERT INTO Usuario (Usuario,contraseña,tipo_usuario,RFC_usuario,Nombre_usuario) VALUES ('Albert','1234','Vendedor','MSOFPW3RER','alb');
INSERT INTO Usuario (Usuario,contraseña,tipo_usuario,RFC_usuario,Nombre_usuario) VALUES ('Oswi','1234','Vendedor','MSOFPW3RER','osw');
INSERT INTO Usuario (Usuario,contraseña,tipo_usuario,RFC_usuario,Nombre_usuario) VALUES ('Max','1234','Vendedor','MSOFPW3RER','max');
-- -------------------------------------------INSERTAR EN CATEGORIA ------------------------
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('1','Chocolate');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('2','Gomita');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('3','Paleta');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('4','Chicle');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('5','Fruta');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('6','Bombones');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('7','Cacahuate');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('8','Obleas');
INSERT INTO Categoria_Producto (idCategoria_Producto,Nombre_Categoria) VALUES ('9','Caramelo');
-- -------------------------------------------INSERTAR EN PROVEEDOR ------------------------
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('1','Pedro','3271049974','GLMN1234GHA');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('2','Enrique Mendoza','3111098899','ALMN1234ANB');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('3','Ricardo Olivarez','3271238875','GNFN1234QWER');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('4','Oliver Gonzalez','3111543423','LMNK1234AMV');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('5','Maria Jaqueline','3113459878','MLN1234ASD');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('6','Lilly ','3114559899','GTYN1234AWS');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('7','Juan Garcia','3226897896','NMBS1234AQS');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('8','Ana Torres','3223456677','RFCM234HGM');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('9','Sofia Martinez','3271123456','LFMA1234ASW');
INSERT INTO Proveedor (id_proveedor,nombre_proveedor,telefono_proveedor,RFC_proveedor) VALUES ('10','Carlos Ruiz','3211234567','PFM1234YUI');
-- -------------------------------------------INSERTAR EN ALMACEN ------------------------
/*INSERT INTO almacen (nombre_producto,existencias,fecha_llegada,fecha_caducidad,Precio,proveedor,unidad,fk_idCategoria_producto,Proveedor_id_proveedor) values ('PicaFresa','250','31-10-2023','29-02-2024','50','Rosa','9');
*/


INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Rockaleta','100','gr','10','65','2','1');
INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Pecosita','200','gr','50','80','9','1');
INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Mangomita','300','gr','50','50','3','1');
INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Swincle','150','gr','15','105','3','1');
INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Mazapan','400','gr','40','120','7','1');
INSERT INTO almacen (nombre_producto,peso_producto,unidad_peso,unidades_paquete,Precio,fk_idCategoria_Producto,Proveedor_id_proveedor) values ('Paleta Payazo','120','gr','10','180','2','1');

-- -------------------------------------------INSERTAR EN Venta ------------------------
INSERT INTO Venta (fecha_venta,total_venta,Producto_id_producto,Usuario_id_Usuario) VALUES ('06-04-2023','66','1','3');
INSERT INTO Venta (fecha_venta,total_venta,Producto_id_producto,Usuario_id_Usuario) VALUES ('06-06-2023','40','2','3');
INSERT INTO Venta (fecha_venta,total_venta,Producto_id_producto,Usuario_id_Usuario) VALUES ('06-05-2023','100','2','1');
INSERT INTO Venta (fecha_venta,total_venta,Producto_id_producto,Usuario_id_Usuario) VALUES ('06-08-2023','130','3','1');
-- -------------------------------------------INSERTAR EN CORTE ------------------------
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('12-04-2023','1200','1');
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('13-04-2023','1000','2');
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('14-04-2023','1500','1');
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('15-04-2023','2000','2');
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('16-04-2023','1800','1');
INSERT INTO Corte (fecha_corte,total_corte,Usuario_id_Usuario) VALUES ('17-04-2023','1700','1');
-- -------------------------------------------INSERTAR EN Ticket ------------------------
INSERT INTO Ticket (Venta_id_venta) VALUES (1);
INSERT INTO Ticket (Venta_id_venta) VALUES (2);
INSERT INTO Ticket (Venta_id_venta) VALUES (3);
INSERT INTO Ticket (Venta_id_venta) VALUES (4);
-- -------------------------------------------INSERT EN FACTURA -----------------------------
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('15-01-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('30-01-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('12-02-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('26-02-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('16-03-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('03-04-2023','Completada','1');
INSERT INTO FACTURA (Fecha_Llegada,Estado,Proveedor_idProveedor) VALUES ('18-04-2023','Completada','1');
-- -------------------------------------------INSERT EN ALMACEN -----------------------------
INSERT INTO ALMACEN (Existencias,Fecha_Caducidad,Producto_id_producto,Factura_idFactura) VALUES ('40',"21-05-2023",'2','7');
INSERT INTO ALMACEN (Existencias,Fecha_Caducidad,Producto_id_producto,Factura_idFactura) VALUES ('120',"12-06-2023",'1','7');
INSERT INTO ALMACEN (Existencias,Fecha_Caducidad,Producto_id_producto,Factura_idFactura) VALUES ('60',"05-06-2023",'3','7');
INSERT INTO ALMACEN (Existencias,Fecha_Caducidad,Producto_id_producto,Factura_idFactura) VALUES ('80',"13-06-2023",'5','7');
INSERT INTO ALMACEN (Existencias,Fecha_Caducidad,Producto_id_producto,Factura_idFactura) VALUES ('100',"02-07-2023",'7','7');