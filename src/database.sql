String varname1 = ""
+ "-- MySQL Workbench Forward Engineering "
+ " "
+ "SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;";


String varname11 = ""
+ "SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;";


String varname12 = ""
+ "SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'; "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Schema mydb "
+ "-- ----------------------------------------------------- "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Schema mydb "
+ "-- -----------------------------------------------------";


String varname13 = ""
+ "CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;";


String varname14 = ""
+ "USE `mydb` ; "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Portata` "
+ "-- -----------------------------------------------------";


String varname15 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Portata` ( "
+ "  `idPortata` INT NOT NULL AUTO_INCREMENT, "
+ "  `Name` VARCHAR(45) NOT NULL, "
+ "  `Description` VARCHAR(45) NOT NULL, "
+ "  `Price` DECIMAL NOT NULL, "
+ "  `Tipo` ENUM('PRIMO', 'SECONDO', 'DOLCE', 'BEVANDA') NOT NULL, "
+ "  PRIMARY KEY (`idPortata`)) "
+ "ENGINE = InnoDB; "
+ " "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Menu` "
+ "-- -----------------------------------------------------";


String varname16 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Menu` ( "
+ "  `idMenu` INT NOT NULL AUTO_INCREMENT, "
+ "  `MenuType` ENUM('CARNIVORO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
+ "  PRIMARY KEY (`idMenu`)) "
+ "ENGINE = InnoDB; "
+ " "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Cliente` "
+ "-- -----------------------------------------------------";


String varname17 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` ( "
+ "  `idCliente` INT NOT NULL AUTO_INCREMENT, "
+ "  `Name` VARCHAR(45) NOT NULL, "
+ "  `Surname` VARCHAR(45) NOT NULL, "
+ "  `PhoneNumber` VARCHAR(45) NOT NULL, "
+ "  `Email` VARCHAR(45) NOT NULL, "
+ "  `ClientType` ENUM('CARNIVORO', 'VEGANO', 'VEGETARIANO') NOT NULL, "
+ "  `Menu_idMenu` INT NOT NULL, "
+ "  PRIMARY KEY (`idCliente`), "
+ "  INDEX `fk_Cliente_Menu1_idx` (`Menu_idMenu` ASC) VISIBLE, "
+ "  CONSTRAINT `fk_Cliente_Menu1` "
+ "    FOREIGN KEY (`Menu_idMenu`) "
+ "    REFERENCES `mydb`.`Menu` (`idMenu`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION) "
+ "ENGINE = InnoDB; "
+ " "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Tavolo` "
+ "-- -----------------------------------------------------";


String varname18 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Tavolo` ( "
+ "  `idTavolo` INT NOT NULL AUTO_INCREMENT, "
+ "  PRIMARY KEY (`idTavolo`)) "
+ "ENGINE = InnoDB; "
+ " "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Menu_has_Portata` "
+ "-- -----------------------------------------------------";


String varname19 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Menu_has_Portata` ( "
+ "  `Menu_idMenu` INT NOT NULL, "
+ "  `Portata_idPortata` INT NOT NULL, "
+ "  PRIMARY KEY (`Menu_idMenu`, `Portata_idPortata`), "
+ "  INDEX `fk_Menu_has_Portata_Portata1_idx` (`Portata_idPortata` ASC) VISIBLE, "
+ "  INDEX `fk_Menu_has_Portata_Menu_idx` (`Menu_idMenu` ASC) VISIBLE, "
+ "  CONSTRAINT `fk_Menu_has_Portata_Menu` "
+ "    FOREIGN KEY (`Menu_idMenu`) "
+ "    REFERENCES `mydb`.`Menu` (`idMenu`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION, "
+ "  CONSTRAINT `fk_Menu_has_Portata_Portata1` "
+ "    FOREIGN KEY (`Portata_idPortata`) "
+ "    REFERENCES `mydb`.`Portata` (`idPortata`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION) "
+ "ENGINE = InnoDB; "
+ " "
+ " "
+ "-- ----------------------------------------------------- "
+ "-- Table `mydb`.`Prenotazione` "
+ "-- -----------------------------------------------------";


String varname110 = ""
+ "CREATE TABLE IF NOT EXISTS `mydb`.`Prenotazione` ( "
+ "  `idPrenotazione` INT NOT NULL AUTO_INCREMENT, "
+ "  `Time` DATETIME NOT NULL, "
+ "  `Cliente_idCliente` INT NOT NULL, "
+ "  `Tavolo_idTavolo` INT NOT NULL, "
+ "  PRIMARY KEY (`idPrenotazione`), "
+ "  INDEX `fk_Prenotazione_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE, "
+ "  INDEX `fk_Prenotazione_Tavolo1_idx` (`Tavolo_idTavolo` ASC) VISIBLE, "
+ "  CONSTRAINT `fk_Prenotazione_Cliente1` "
+ "    FOREIGN KEY (`Cliente_idCliente`) "
+ "    REFERENCES `mydb`.`Cliente` (`idCliente`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION, "
+ "  CONSTRAINT `fk_Prenotazione_Tavolo1` "
+ "    FOREIGN KEY (`Tavolo_idTavolo`) "
+ "    REFERENCES `mydb`.`Tavolo` (`idTavolo`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION) "
+ "ENGINE = InnoDB;";


String varname111 = ""
+ "SET SQL_MODE=@OLD_SQL_MODE;";


String varname112 = ""
+ "SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;";


String varname113 = ""
+ "SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;";
