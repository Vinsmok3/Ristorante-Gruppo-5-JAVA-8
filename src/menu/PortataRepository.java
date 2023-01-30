package menu;

import java.sql.*;

public class PortataRepository {

    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public void createMenuPortata() throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryPortata = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Portata` ( "
                + "  `idPortata` INT NOT NULL AUTO_INCREMENT, "
                + "  `Name` VARCHAR(45) NOT NULL , "
                + "  `Description` VARCHAR(45) NOT NULL, "
                + "  `Price` DECIMAL NOT NULL, "
                + "  `Tipo` ENUM('PRIMO', 'SECONDO', 'DOLCE', 'BEVANDA') NOT NULL, "
                + "  PRIMARY KEY (`idPortata`)) ";
        statement.executeUpdate(queryPortata);
        connection.close();
    }

    public void insertMenuPortata(Portata portata) throws SQLException{
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkPortata = "SELECT * FROM ristorantedb.Portata WHERE Name='"
                +portata.getName()+"';";
        ResultSet rs = statement.executeQuery(checkPortata);
        if(!rs.next()){String insertPortata = "INSERT INTO ristorantedb.Portata (Name, Description, Price, Tipo) VALUES ('"
                +portata.getName()+"','"
                +portata.getType()+"','"
                +portata.getPrice()+"','"
                +portata.getTipoPortata()+"');";
        statement.executeUpdate(insertPortata);
        connection.close();
        statement.close();
        rs.close();
    }


    }

}


