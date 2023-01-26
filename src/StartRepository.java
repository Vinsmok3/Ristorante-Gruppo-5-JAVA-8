import menu.*;

import java.sql.SQLException;

public class StartRepository {
    public static void main(String[] args) throws SQLException {
       final String url = "jdbc:mysql://localhost:3306/mydb";
       final String user = "root";
       final String password = "password";
        MenuItemRepository menuItemRepository = new MenuItemRepository();
        menuItemRepository.createMenuPortata();
        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, true, TipoEnum.BEVANDA, TipoDrinkEnum.ALCOLICO_LEGGERO, 7.5);

        menuItemRepository.insertMenuPortata(bevanda1);

    }
}
