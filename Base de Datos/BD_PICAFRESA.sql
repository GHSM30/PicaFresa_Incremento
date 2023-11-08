-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema BD_PicaFresa
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `BD_PicaFresa` ;

-- -----------------------------------------------------
-- Schema BD_PicaFresa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `BD_PicaFresa` ;
USE `BD_PicaFresa` ;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Proveedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Proveedor` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Proveedor` (
  `id_proveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre_proveedor` VARCHAR(45) NOT NULL,
  `telefono_proveedor` VARCHAR(45) NOT NULL,
  `RFC_proveedor` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`id_proveedor`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Categoria_Producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Categoria_Producto` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Categoria_Producto` (
  `idCategoria_Producto` INT NOT NULL,
  `Nombre_Categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria_Producto`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Producto` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Producto` (
  `id_producto` INT NOT NULL AUTO_INCREMENT,
  `nombre_producto` VARCHAR(40) NOT NULL,
  `existencias` INT NOT NULL,
  `fecha_llegada` VARCHAR(10) NOT NULL,
  `fecha_caducidad` VARCHAR(10) NOT NULL,
  `Precio` FLOAT NOT NULL,
  `fk_idCategoria_Producto` INT NOT NULL,
  `Proveedor_id_proveedor` INT NOT NULL,
  PRIMARY KEY (`id_producto`, `fk_idCategoria_Producto`, `Proveedor_id_proveedor`),
  INDEX `fk_Producto_Proveedor_idx` (`Proveedor_id_proveedor` ASC) VISIBLE,
  INDEX `fk_Producto_Cateoria_Producto1_idx` (`fk_idCategoria_Producto` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Proveedor`
    FOREIGN KEY (`Proveedor_id_proveedor`)
    REFERENCES `BD_PicaFresa`.`Proveedor` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Cateoria_Producto1`
    FOREIGN KEY (`fk_idCategoria_Producto`)
    REFERENCES `BD_PicaFresa`.`Categoria_Producto` (`idCategoria_Producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Factura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Factura` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Factura` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `Fecha_llegada` VARCHAR(10) NOT NULL,
  `Estado` VARCHAR(10) NOT NULL,
  `Proveedor_idProveedor` INT NOT NULL,
  PRIMARY KEY (`idFactura`, `Proveedor_idProveedor`),
  INDEX `fk_Factura_Proveedor1_idx` (`Proveedor_idProveedor` ASC) VISIBLE,
  CONSTRAINT `fk_Factura_Proveedor1`
    FOREIGN KEY (`Proveedor_idProveedor`)
    REFERENCES `BD_PicaFresa`.`Proveedor` (`id_proveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Almacen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Almacen` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Almacen` (
 `id_Almacen` INT NOT NULL AUTO_INCREMENT,
 `Existencias` INT NOT NULL,
  `Fecha_caducidad` VARCHAR(10) NOT NULL,
  `Producto_id_producto` INT NOT NULL,
  `Factura_idFactura` INT NOT NULL,
  PRIMARY KEY (`id_Almacen`,`Producto_id_producto`, `Factura_idFactura`),
  INDEX `fk_Almacen_Factura1_idx` (`Factura_idFactura` ASC) VISIBLE,
  CONSTRAINT `fk_Almacen_Producto1`
    FOREIGN KEY (`Producto_id_producto`)
    REFERENCES `BD_PicaFresa`.`Producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Almacen_Factura1`
    FOREIGN KEY (`Factura_idFactura`)
    REFERENCES `BD_PicaFresa`.`Factura` (`idFactura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Usuario` (
  `id_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `tipo_usuario` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Usuario`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Venta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Venta` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Venta` (
  `id_venta` INT NOT NULL AUTO_INCREMENT,
  `fecha_venta` VARCHAR(10) NOT NULL,
  `total_venta` FLOAT NOT NULL,
  `Producto_id_producto` INT NOT NULL,
  `Usuario_id_Usuario` INT NOT NULL,
  PRIMARY KEY (`id_venta`, `Producto_id_producto`, `Usuario_id_Usuario`),
  INDEX `fk_Venta_Producto1_idx` (`Producto_id_producto` ASC) VISIBLE,
  INDEX `fk_Venta_Usuario1_idx` (`Usuario_id_Usuario` ASC) VISIBLE,
  CONSTRAINT `fk_Venta_Producto1`
    FOREIGN KEY (`Producto_id_producto`)
    REFERENCES `BD_PicaFresa`.`Producto` (`id_producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_Usuario1`
    FOREIGN KEY (`Usuario_id_Usuario`)
    REFERENCES `BD_PicaFresa`.`Usuario` (`id_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`DetalleVenta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`DetalleVenta` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`DetalleVenta` (
  `Venta_id_venta` INT NOT NULL,
  `nombre_producto` VARCHAR(40) NOT NULL,
  `precio_producto` FLOAT NOT NULL,
  `cantidad_producto` INT NOT NULL,
  PRIMARY KEY (`Venta_id_venta`),
  CONSTRAINT `fk_DetalleVenta_Venta1`
    FOREIGN KEY (`Venta_id_venta`)
    REFERENCES `BD_PicaFresa`.`Venta` (`id_venta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Devoluciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Devoluciones` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Devoluciones` (
  `Venta_id_venta` INT NOT NULL,
  `nombre_producto` VARCHAR(40) NOT NULL,
  `precio_producto` FLOAT NOT NULL,
  `cantidad_producto` INT NOT NULL,
  `descuento_producto` INT NOT NULL,
  PRIMARY KEY (`Venta_id_venta`),
  CONSTRAINT `fk_DetalleVenta_Venta10`
    FOREIGN KEY (`Venta_id_venta`)
    REFERENCES `BD_PicaFresa`.`Venta` (`id_venta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Ticket`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Ticket` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Ticket` (
  `id_ticket` INT NOT NULL AUTO_INCREMENT,
  `Venta_id_venta` INT NOT NULL,
  PRIMARY KEY (`id_ticket`, `Venta_id_venta`),
  INDEX `fk_Ticket_Venta1_idx` (`Venta_id_venta` ASC) VISIBLE,
  CONSTRAINT `fk_Ticket_Venta1`
    FOREIGN KEY (`Venta_id_venta`)
    REFERENCES `BD_PicaFresa`.`Venta` (`id_venta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `BD_PicaFresa`.`Corte`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `BD_PicaFresa`.`Corte` ;

CREATE TABLE IF NOT EXISTS `BD_PicaFresa`.`Corte` (
  `id_corte` INT NOT NULL AUTO_INCREMENT,
  `fecha_corte` VARCHAR(10) NOT NULL,
  `total_corte` FLOAT NOT NULL,
  `Usuario_id_Usuario` INT NOT NULL,
  PRIMARY KEY (`id_corte`, `Usuario_id_Usuario`),
  INDEX `fk_Corte_Usuario1_idx` (`Usuario_id_Usuario` ASC) VISIBLE,
  CONSTRAINT `fk_Corte_Usuario1`
    FOREIGN KEY (`Usuario_id_Usuario`)
    REFERENCES `BD_PicaFresa`.`Usuario` (`id_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
