package tableRestaurant;

import menu.Portata;

import java.sql.*;

public class TavoliRepository {
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public void createTavolo() throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryTavolo = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Tavolo` ( "
                + "  `idTavolo` INT NOT NULL AUTO_INCREMENT, "
                + "  `TableNumber` INT (45) NOT NULL , "
                + "  `Available` BIT NOT NULL, "
                + "  `Client` VARCHAR (65) NOT NULL, "
                + "  PRIMARY KEY (`idTavolo`)) ";
        statement.executeUpdate(queryTavolo);
        connection.close();
    }
    public void insertTavolo(Tavoli tavolo) throws SQLException{
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkTavolo = "SELECT * FROM ristorantedb.Portata WHERE TableNumber='"+tavolo.getTableNumber()+"';";
        ResultSet rs = statement.executeQuery(checkTavolo);
        if(!rs.next()){String insertTavolo = "INSERT INTO ristorantedb.Tavolo (TableNumber, Available, Client) VALUES ('"+tavolo.getTableNumber()+"','"+tavolo.isAvailable()+"','"+tavolo.getCliente()+"');";
            statement.executeUpdate(insertTavolo);
            connection.close();
            statement.close();
            rs.close();
        }


}}
