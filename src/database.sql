//DONE
String queryPortata = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Portata` ( "
                + "  `idPortata` INT NOT NULL AUTO_INCREMENT, "
                + "  `Name` VARCHAR(45) NOT NULL , "
                + "  `Description` VARCHAR(45) NOT NULL, "
                + "  `Price` DECIMAL NOT NULL, "
                + "  `Tipo` ENUM('PRIMO', 'SECONDO', 'DOLCE', 'BEVANDA') NOT NULL, "
                + "  PRIMARY KEY (`idPortata`)) ";

//DONE
String queryCreateMenu = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Menu` ( "
                + "  `idMenu` INT NOT NULL AUTO_INCREMENT, "
                + "  `MenuType` ENUM('CARNIVORO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
                + "  PRIMARY KEY (`idMenu`)) ";

//DONE
String queryTavolo = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Tavolo` ( "
                + "  `idTavolo` INT NOT NULL AUTO_INCREMENT, "
                + "  `TableNumber` INT (45) NOT NULL , "
                + "  `Available` TINYINT(1) NOT NULL, "
                + "  `Client` VARCHAR (65) NOT NULL, "
                + "  PRIMARY KEY (`idTavolo`)) ";

//DONE
String queryMenu = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Menu_has_Portata` ( "
                + "  `Menu_idMenu` INT NOT NULL, "
                + "  `Portata_idPortata` INT NOT NULL, "
                + "  PRIMARY KEY (`Menu_idMenu`, `Portata_idPortata`), "
                + "  INDEX `fk_Menu_has_Portata_Portata1_idx` (`Portata_idPortata` ASC) VISIBLE, "
                + "  INDEX `fk_Menu_has_Portata_Menu_idx` (`Menu_idMenu` ASC) VISIBLE, "
                + "  CONSTRAINT `fk_Menu_has_Portata_Menu` "
                + "    FOREIGN KEY (`Menu_idMenu`) "
                + "    REFERENCES `ristorantedb`.`Menu` (`idMenu`) "
                + "    ON DELETE NO ACTION "
                + "    ON UPDATE NO ACTION, "
                + "  CONSTRAINT `fk_Menu_has_Portata_Portata1` "
                + "    FOREIGN KEY (`Portata_idPortata`) "
                + "    REFERENCES `ristorantedb`.`Portata` (`idPortata`) "
                + "    ON DELETE NO ACTION "
                + "    ON UPDATE NO ACTION) ";

String queryPrenotazione = ""
+ "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Prenotazione` ( "
+ "  `idPrenotazione` INT NOT NULL AUTO_INCREMENT, "
+ "  `Time` DATETIME NOT NULL, "
+ "  `Cliente_idCliente` INT NOT NULL, "
+ "  `Tavolo_idTavolo` INT NOT NULL, "
+ "  PRIMARY KEY (`idPrenotazione`), "
+ "  INDEX `fk_Prenotazione_Cliente1_idx` (`Cliente_idCliente` ASC) VISIBLE, "
+ "  INDEX `fk_Prenotazione_Tavolo1_idx` (`Tavolo_idTavolo` ASC) VISIBLE, "
+ "  CONSTRAINT `fk_Prenotazione_Cliente1` "
+ "    FOREIGN KEY (`Cliente_idCliente`) "
+ "    REFERENCES `ristorantedb`.`Cliente` (`idCliente`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION, "
+ "  CONSTRAINT `fk_Prenotazione_Tavolo1` "
+ "    FOREIGN KEY (`Tavolo_idTavolo`) "
+ "    REFERENCES `ristorantedb`.`Tavolo` (`idTavolo`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION) "

String queryCliente = ""
+ "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Cliente` ( "
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
+ "    REFERENCES `ristorantedb`.`Menu` (`idMenu`) "
+ "    ON DELETE NO ACTION "
+ "    ON UPDATE NO ACTION) "



CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Surname` VARCHAR(45) NOT NULL,
  `PhoneNumber` VARCHAR(45) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `ClientType` ENUM('CARNIVORO', 'VEGANO', 'VEGETARIANO') NOT NULL,
  `Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idCliente`),
  INDEX `fk_Cliente_Menu1_idx` (`Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Cliente_Menu1`
    FOREIGN KEY (`Menu_idMenu`)
    REFERENCES `mydb`.`Menu` (`idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB