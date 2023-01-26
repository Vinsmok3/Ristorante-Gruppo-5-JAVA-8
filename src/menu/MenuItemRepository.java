package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MenuItemRepository {

    private final String url = "jdbc:mysql://localhost:3306/mydb";
    private final String user = "root";
    private final String password = "password";

    public void createMenuPortata() throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryPortata = ""
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
        statement.executeUpdate(queryPortata);
        connection.close();
    }
    public void insertMenuPortata(Portata portata) throws SQLException{
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String insertPortata = " "
                + " INSERT INTO mydb.Portata"
                + " (Name, Description, Price, Tipo)"
                + "VALUES('"+portata.getName()+"','"+portata.getType()+"',"+portata.getPrice()+","+portata.getTipoPortata()+")";
        statement.executeUpdate(insertPortata);
        connection.close();
    }
}
