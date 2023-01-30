package client;

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
                + " `Tipo_Cliente` ENUM('CARNIVORO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
                + "  PRIMARY KEY (`id_Cliente`)) ";
        statement.executeUpdate(queryCliente);
        statement.close();
        connection.close();
    }

    public void insertCliente(Cliente cliente) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkCliente = "SELECT * FROM ristorantedb.Cliente WHERE Cliente_id='" + cliente.getSurname() + "';";
        ResultSet rs = statement.executeQuery(checkCliente);
        if (!rs.next()) {
            String insertCliente = "INSERT INTO ristorantedb.Cliente (Surname, Name, Phone_Number, Email, Is_Reservation_Confirmed) VALUES ('" + cliente.getName() + "','" + cliente.getSurname() + "','" + cliente.getPhoneNumber() + "', '" + cliente.getEmail() + "', '" + (cliente.getReservationConfirmed() ? 1 : 0) + "');";
            statement.executeUpdate(insertCliente);
            connection.close();
            statement.close();
            rs.close();
        }
    }
}


