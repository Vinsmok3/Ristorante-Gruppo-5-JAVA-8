package client;

import menu.Menu;

import java.sql.*;

public class ClienteRepository {
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public void createCliente() throws SQLException {

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryCliente = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Cliente` ( "
                + " `id_Cliente` INT NOT NULL AUTO_INCREMENT, "
                + " `Name` VARCHAR (45) NOT NULL, "
                + " `Surname` VARCHAR (45) NOT NULL, "
                + " `Phone_Number` VARCHAR (45) NOT NULL, "
                + " `Email` VARCHAR (45) NOT NULL, "
                + " `Is_Reservation_Confirmed` TINYINT(1) NOT NULL, "
                + " `Tipo_Cliente` ENUM('CLASSICO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
                + " `Menu_idMenu` INT NOT NULL DEFAULT 0, "
                + "  PRIMARY KEY (`id_Cliente`), "
                + "  INDEX `fk_Cliente_Menu1_idx` (`Menu_idMenu` ASC) VISIBLE, "
                + "  CONSTRAINT `fk_Cliente_Menu1` "
                + "    FOREIGN KEY (`Menu_idMenu`) "
                + "    REFERENCES `ristorantedb`.`Menu` (`idMenu`) "
                + "    ON DELETE NO ACTION "
                + "    ON UPDATE NO ACTION) ";

        statement.executeUpdate(queryCliente);
        statement.close();
        connection.close();
    }

    public void insertCliente(Cliente cliente, Menu menu) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkCliente = "SELECT * FROM ristorantedb.Cliente WHERE Surname='" +
                cliente.getSurname() + "';";
        ResultSet rs = statement.executeQuery(checkCliente);
        if (!rs.next()) {
            String insertCliente = "INSERT INTO ristorantedb.Cliente "
                    + "(Name, Surname, Phone_Number, Tipo_Cliente, Email, Is_Reservation_Confirmed, Menu_idMenu) "
                    + "VALUES ('" + cliente.getName() + "','"
                    + cliente.getSurname() + "','"
                    + cliente.getPhoneNumber() + "', '"
                    + cliente.getTipoCliente() + "', '"
                    + cliente.getEmail()+ "', '"
                    + (cliente.getReservationConfirmed() ? 1 : 0) + "', '"
                    + menu.getIdMenu() +"');";
            statement.executeUpdate(insertCliente);
            connection.close();
            statement.close();
            rs.close();
        }
    }
}


