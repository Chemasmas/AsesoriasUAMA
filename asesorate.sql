-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema asesorateUAMA
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema asesorateUAMA
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `asesorateUAMA` DEFAULT CHARACTER SET utf8 ;
USE `asesorateUAMA` ;

-- -----------------------------------------------------
-- Table `asesorateUAMA`.`Profesores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asesorateUAMA`.`Profesores` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `correo` VARCHAR(100) NULL,
  `telefono` VARCHAR(20) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `asesorateUAMA`.`Divisiones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asesorateUAMA`.`Divisiones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `asesorateUAMA`.`Troncos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asesorateUAMA`.`Troncos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `asesorateUAMA`.`UEAs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asesorateUAMA`.`UEAs` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `clave` VARCHAR(10) NULL,
  `trimestre` INT NULL,
  `division` INT NOT NULL,
  `tronco` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_UEAs_Divisiones_idx` (`division` ASC),
  INDEX `fk_UEAs_Troncos1_idx` (`tronco` ASC),
  CONSTRAINT `fk_UEAs_Divisiones`
    FOREIGN KEY (`division`)
    REFERENCES `asesorateUAMA`.`Divisiones` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UEAs_Troncos1`
    FOREIGN KEY (`tronco`)
    REFERENCES `asesorateUAMA`.`Troncos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `asesorateUAMA`.`Profesores_has_UEAs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `asesorateUAMA`.`Profesores_has_UEAs` (
  `profesor` INT NOT NULL,
  `uea` INT NOT NULL,
  `lugar` VARCHAR(45) NULL,
  `inicio` TIME NULL,
  `fin` TIME NULL,
  PRIMARY KEY (`profesor`, `uea`),
  INDEX `fk_Profesores_has_UEAs_UEAs1_idx` (`uea` ASC),
  INDEX `fk_Profesores_has_UEAs_Profesores1_idx` (`profesor` ASC),
  CONSTRAINT `fk_Profesores_has_UEAs_Profesores1`
    FOREIGN KEY (`profesor`)
    REFERENCES `asesorateUAMA`.`Profesores` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profesores_has_UEAs_UEAs1`
    FOREIGN KEY (`uea`)
    REFERENCES `asesorateUAMA`.`UEAs` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- Insert Troncos 
insert into  `asesorateUAMA`.`Troncos` values (null,"Nivelacion Academica ");
insert into  `asesorateUAMA`.`Troncos` values (null,"General ");
insert into  `asesorateUAMA`.`Troncos` values (null,"Inter-Multidisciplinar");

-- Insert Divisiones
insert into  `asesorateUAMA`.`Divisiones` values (null,"Ciencias Basicas e Ingenieria");
insert into  `asesorateUAMA`.`Divisiones` values (null,"Ciencias Sociales  y Humanidades");
insert into  `asesorateUAMA`.`Divisiones` values (null,"Ciencias y Artes para el Diseño ");



-- Insert Proofesores 
insert into  `asesorateUAMA`.`Profesores` values (null,"Ma. Lizbeth Gallardo Lopez","mlgl@correo.com",67895432);
insert into  `asesorateUAMA`.`Profesores` values (null,"Enrique Aduana Espinosa ","eae@correo.com",45678900);
insert into  `asesorateUAMA`.`Profesores` values (null,"Gabriela Baez Juarez ","gbj@correo.com",25689431);
insert into  `asesorateUAMA`.`Profesores` values (null,"Jose Luis Cardoso","jlc@correo.com",34567893);
insert into  `asesorateUAMA`.`Profesores` values (null,"Irma Delfin Alcala","ida@correo.com",67896542);
insert into  `asesorateUAMA`.`Profesores` values (null,"Nicolas Falcon Hernandez","nfhl@correo.com",34578954);
insert into  `asesorateUAMA`.`Profesores` values (null,"Jose Alfredo Heras Gomez","jahg@correo.com",23456781);
insert into  `asesorateUAMA`.`Profesores` values (null,"Salazar Velasco Francisco","svf@correo.com",98754215);
insert into  `asesorateUAMA`.`Profesores` values (null,"Pedro Pereyra Padilla ","ppp@correo.com",87654321);
insert into  `asesorateUAMA`.`Profesores` values (null,"Guadalupe Hernandez Martinez","ghm@correo.com",87541902);


-- Insert Ueas
insert into `asesorateUAMA`.`UEAs`values (null,"Programacion Orientada a Eventos","123456",6,1,3);
insert into `asesorateUAMA`.`UEAs`values (null,"Sistemas Distribuidos","111234",9,1,3);
insert into `asesorateUAMA`.`UEAs`values (null,"Sistemas Operativos","876543",8,1,3);
insert into `asesorateUAMA`.`UEAs`values (null,"Base de datos","876541",5,1,3);
insert into `asesorateUAMA`.`UEAs`values (null,"Investigacion de operaciones","675432",4,1,3);
insert into `asesorateUAMA`.`UEAs`values (null,"Intriduccion al Calculo","101112",2,1,2);
insert into `asesorateUAMA`.`UEAs`values (null,"Taller de Matematicas","876541",1,1,1);
insert into `asesorateUAMA`.`UEAs`values (null,"Metodos Numericos","123456",7,1,2);

-- insert `asesorateUAMA`.`Profesores_has_UEAs`
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (3,4,"G302",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (1,6,"F104",'11:00','11:10');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (5,5,"K302",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (8,7,"B106",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (2,8,"D202",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (4,2,"E310",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (6,4,"L304",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (4,9,"W307",'10:00','10:30');
insert into `asesorateUAMA`.`Profesores_has_UEAs`values (9,3,"P202",'10:00','10:30');
