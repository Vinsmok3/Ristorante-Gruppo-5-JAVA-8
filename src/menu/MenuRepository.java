package menu;

import java.sql.*;

public class MenuRepository {
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public void createMenuPortata() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
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
        statement.executeUpdate(queryMenu);
        statement.close();
    }
    public void createMenu() throws SQLException{
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryCreateMenu = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Menu` ( "
                + "  `idMenu` INT NOT NULL AUTO_INCREMENT, "
                + "  `MenuType` ENUM('CLASSICO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
                + "  PRIMARY KEY (`idMenu`)) ";
        statement.executeUpdate(queryCreateMenu);
        connection.close();
    }
    public void insertMenu(Menu menu) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkMenu = "SELECT * FROM ristorantedb.Menu WHERE MenuType='" +
                menu.getEnumTipoMenu() + "';";
        ResultSet rs = statement.executeQuery(checkMenu);
        if (!rs.next()) {
            String insertMenu = "INSERT INTO ristorantedb.Menu "
                    + "(MenuType) "
                    + "VALUES ('" + menu.getEnumTipoMenu() +"');";
            statement.executeUpdate(insertMenu);
            connection.close();
            statement.close();
            rs.close();
        }
    }
}