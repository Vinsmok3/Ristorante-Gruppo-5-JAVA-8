import menu.Menu;
import menu.PortataRepository;
import menu.TipoMenuEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StartRepository {
    public static void main(String[] args) throws SQLException {
       final String url = "jdbc:mysql://localhost:3306/";
       final String user = "root";
       final String password = "password";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE IF NOT EXISTS ristorantedb";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Menu menu = new Menu(TipoMenuEnum.CLASSICO,"Classico");
        menu.createMenu();
        PortataRepository menuItemRepository = new PortataRepository();
        menuItemRepository.createMenuPortata();
        //Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, true, TipoEnum.BEVANDA, TipoDrinkEnum.ALCOLICO_LEGGERO, 7.5);

        //menuItemRepository.insertMenuPortata(bevanda1);

    }
}
