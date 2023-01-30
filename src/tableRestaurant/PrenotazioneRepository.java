package tableRestaurant;

import client.Cliente;

import java.sql.*;

public class PrenotazioneRepository {
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public void createPrenotazione() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryPrenotazione = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Prenotazione` ( "
                + "  `idPrenotazione` INT NOT NULL AUTO_INCREMENT, "
                + "  `Time` INT NOT NULL, "
                + "  `Cliente_id_Cliente` INT NOT NULL, "
                + "  `Tavolo_idTavolo` INT NOT NULL, "
                + "  PRIMARY KEY (`idPrenotazione`), "
                + "  INDEX `fk_Prenotazione_Cliente1_idx` (`Cliente_id_Cliente` ASC) VISIBLE, "
                + "  INDEX `fk_Prenotazione_Tavolo1_idx` (`Tavolo_idTavolo` ASC) VISIBLE, "
                + "  CONSTRAINT `fk_Prenotazione_Cliente1` "
                + "    FOREIGN KEY (`Cliente_id_Cliente`) "
                + "    REFERENCES `ristorantedb`.`Cliente` (`id_Cliente`) "
                + "    ON DELETE NO ACTION "
                + "    ON UPDATE NO ACTION, "
                + "  CONSTRAINT `fk_Prenotazione_Tavolo1` "
                + "    FOREIGN KEY (`Tavolo_idTavolo`) "
                + "    REFERENCES `ristorantedb`.`Tavolo` (`idTavolo`) "
                + "    ON DELETE NO ACTION "
                + "    ON UPDATE NO ACTION) ";
        statement.executeUpdate(queryPrenotazione);
        statement.close();
        connection.close();
    }

    public void insertPrenotazione(Prenotazione prenotazione, Cliente cliente,Tavoli tavoli) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        String queryIDCliente = "SELECT id_Cliente FROM ristorantedb.Cliente WHERE Surname = '" + cliente.getSurname() + "';";
        ResultSet rsCliente = statement.executeQuery(queryIDCliente);
        int clientId = 0;
        if (rsCliente.next()) {
            clientId = rsCliente.getInt("id_Cliente");
        }
        String queryIDTavolo = "SELECT idTavolo FROM ristorantedb.Tavolo WHERE TableNumber = '" + tavoli.getTableNumber() + "';";
        ResultSet rsTavolo = statement.executeQuery(queryIDTavolo);
        int tableId = 0;
        if (rsTavolo.next()) {
            tableId = rsTavolo.getInt("idTavolo");
        }
        String checkPrenotazione = "SELECT * FROM ristorantedb.Prenotazione WHERE Tavolo_idTavolo = '" + tableId + "' AND Time = '" + prenotazione.getTime() + "';";        //ResultSet rs = statement.executeQuery(checkPrenotazione);
        ResultSet rs = statement.executeQuery(checkPrenotazione);
        if (!rs.next()) {
            String insertPrenotazione = "INSERT INTO ristorantedb.Prenotazione " +
                    "(Time, Cliente_id_Cliente, Tavolo_idTavolo) "
                    + "VALUES ('" + prenotazione.getTime()  + "','"
                    + clientId + "','"
                    + tableId + "');";
            statement.executeUpdate(insertPrenotazione);
            connection.close();
            statement.close();
            rs.close();
        }
    }
}