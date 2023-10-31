-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bd_picafresa
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `bd_picafresa` ;

-- -----------------------------------------------------
-- Schema bd_picafresa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_picafresa` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bd_picafresa` ;

-- -----------------------------------------------------
-- Table `bd_picafresa`.`categoria_producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`categoria_producto` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`categoria_producto` (
  `idCategoria_Producto` INT NOT NULL,
  `Nombre_Categoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria_Producto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`usuario` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`usuario` (
  `id_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Usuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `tipo_usuario` VARCHAR(45) NOT NULL,
  `Correo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_Usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`venta`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`venta` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`venta` (
  `id_venta` INT NOT NULL AUTO_INCREMENT,
  `fecha_venta` VARCHAR(10) NOT NULL,
  `total_venta` FLOAT NOT NULL,
  `Usuario_id_Usuario` INT NOT NULL,
  PRIMARY KEY (`id_venta`, `Usuario_id_Usuario`),
  CONSTRAINT `fk_Venta_Usuario1`
    FOREIGN KEY (`Usuario_id_Usuario`)
    REFERENCES `bd_picafresa`.`usuario` (`id_Usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_Venta_Usuario1_idx` ON `bd_picafresa`.`venta` (`Usuario_id_Usuario` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`proveedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`proveedor` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`proveedor` (
  `id_proveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre_proveedor` VARCHAR(45) NOT NULL,
  `telefono_proveedor` VARCHAR(45) NOT NULL,
  `RFC_proveedor` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`id_proveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`factura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`factura` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`factura` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `Serial` VARCHAR(20) NOT NULL,
  `Fecha_llegada` VARCHAR(10) NOT NULL,
  `Estado` VARCHAR(10) NOT NULL,
  `Proveedor_idProveedor` INT NOT NULL,
  PRIMARY KEY (`idFactura`, `Proveedor_idProveedor`),
  CONSTRAINT `fk_Factura_Proveedor1`
    FOREIGN KEY (`Proveedor_idProveedor`)
    REFERENCES `bd_picafresa`.`proveedor` (`id_proveedor`))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_Factura_Proveedor1_idx` ON `bd_picafresa`.`factura` (`Proveedor_idProveedor` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`almacen`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`almacen` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`almacen` (
  `Nombre_producto` VARCHAR(45) NOT NULL,
  `Existencias` VARCHAR(45) NOT NULL,
  `Fecha_llegada` VARCHAR(45) NOT NULL,
  `Fecha_caducidad` VARCHAR(45) NOT NULL,
  `Precio` VARCHAR(45) NOT NULL,
  `Proveedor` VARCHAR(45) NOT NULL,
  `Unidad` VARCHAR(45) NOT NULL,
  `categoria_producto_idCategoria_Producto` INT NOT NULL,
  `venta_id_venta` INT NOT NULL,
  `venta_Usuario_id_Usuario` INT NOT NULL,
  `factura_idFactura` INT NOT NULL,
  `factura_Proveedor_idProveedor` INT NOT NULL,
  PRIMARY KEY (`categoria_producto_idCategoria_Producto`, `venta_id_venta`, `venta_Usuario_id_Usuario`, `factura_idFactura`, `factura_Proveedor_idProveedor`),
  CONSTRAINT `fk_almacen_categoria_producto1`
    FOREIGN KEY (`categoria_producto_idCategoria_Producto`)
    REFERENCES `bd_picafresa`.`categoria_producto` (`idCategoria_Producto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_almacen_venta1`
    FOREIGN KEY (`venta_id_venta` , `venta_Usuario_id_Usuario`)
    REFERENCES `bd_picafresa`.`venta` (`id_venta` , `Usuario_id_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_almacen_factura1`
    FOREIGN KEY (`factura_idFactura` , `factura_Proveedor_idProveedor`)
    REFERENCES `bd_picafresa`.`factura` (`idFactura` , `Proveedor_idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_almacen_venta1_idx` ON `bd_picafresa`.`almacen` (`venta_id_venta` ASC, `venta_Usuario_id_Usuario` ASC) VISIBLE;

CREATE INDEX `fk_almacen_factura1_idx` ON `bd_picafresa`.`almacen` (`factura_idFactura` ASC, `factura_Proveedor_idProveedor` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`corte`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`corte` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`corte` (
  `id_corte` INT NOT NULL AUTO_INCREMENT,
  `fecha_corte` VARCHAR(10) NOT NULL,
  `total_corte` FLOAT NOT NULL,
  `Usuario_id_Usuario` INT NOT NULL,
  PRIMARY KEY (`id_corte`, `Usuario_id_Usuario`),
  CONSTRAINT `fk_Corte_Usuario1`
    FOREIGN KEY (`Usuario_id_Usuario`)
    REFERENCES `bd_picafresa`.`usuario` (`id_Usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE INDEX `fk_Corte_Usuario1_idx` ON `bd_picafresa`.`corte` (`Usuario_id_Usuario` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`detalleventa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`detalleventa` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`detalleventa` (
  `Venta_id_venta` INT NOT NULL,
  `cantidad_producto` INT NOT NULL,
  `precio_producto` FLOAT NOT NULL,
  `descuento_producto` FLOAT NOT NULL,
  `SubTotal` FLOAT NOT NULL,
  PRIMARY KEY (`Venta_id_venta`),
  CONSTRAINT `fk_DetalleVenta_Venta1`
    FOREIGN KEY (`Venta_id_venta`)
    REFERENCES `bd_picafresa`.`venta` (`id_venta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`devoluciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`devoluciones` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`devoluciones` (
  `Venta_id_venta` INT NOT NULL,
  `nombre_producto` VARCHAR(40) NOT NULL,
  `precio_producto` FLOAT NOT NULL,
  `cantidad_producto` INT NOT NULL,
  `descuento_producto` INT NOT NULL,
  PRIMARY KEY (`Venta_id_venta`),
  CONSTRAINT `fk_DetalleVenta_Venta10`
    FOREIGN KEY (`Venta_id_venta`)
    REFERENCES `bd_picafresa`.`venta` (`id_venta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bd_picafresa`.`sugerencias`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_picafresa`.`sugerencias` ;

CREATE TABLE IF NOT EXISTS `bd_picafresa`.`sugerencias` (
  `Nombre` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(45) NOT NULL,
  `Demanda` VARCHAR(45) NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
