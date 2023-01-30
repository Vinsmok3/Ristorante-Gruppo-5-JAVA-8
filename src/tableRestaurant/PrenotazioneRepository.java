package tableRestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
                + "  `Time` DATETIME NOT NULL, "
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

    /*public void insertPrenotazione(Prenotazione Prenotazione) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String checkPrenotaizone = "SELECT * FROM ristorantedb.Prenotazione WHERE Name='" + Prenotazione.getIdTavolo() + "';";
        ResultSet rs = statement.executeQuery(checkPrenotaizone);
        if (!rs.next()) {
            String insertPrenotazione = "INSERT INTO ristorantedb.Prenotazione (Name, Description, Price, Tipo) "
                    + "VALUES ('" + portata.getName() + "','"
                    + portata.getType() + "','"
                    + portata.getPrice() + "','"
                    + portata.getTipoPortata() + "');";
            statement.executeUpdate(insertPortata);
            connection.close();
            statement.close();
            rs.close();
        }
    }*/
}