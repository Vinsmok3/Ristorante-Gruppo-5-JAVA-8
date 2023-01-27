package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO aggiungere la somma delle portate in euro, in dollari, ecc ecc
    private final List<Portata> listaPortata = new ArrayList<>();
    private List<TipoEnum> type;
    private String nomeMenu;
    private TipoMenuEnum enumTipoMenu;
    private TipoDrinkEnum tipoDrink;
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public Menu(TipoMenuEnum enumTipoMenu, String nomeMenu) {
        this.enumTipoMenu = enumTipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public void createMenu() throws SQLException{
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String queryCreateMenu = ""
                + "CREATE TABLE IF NOT EXISTS `ristorantedb`.`Menu` ( "
                + "  `idMenu` INT NOT NULL AUTO_INCREMENT, "
                + "  `MenuType` ENUM('CARNIVORO', 'VEGETARIANO', 'VEGANO') NOT NULL, "
                + "  PRIMARY KEY (`idMenu`)) ";
        statement.executeUpdate(queryCreateMenu);
        connection.close();
    }

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public List<TipoEnum> getType() {
        return type;
    }

    public void setType(List<TipoEnum> type) {
        this.type = type;
    }

    public TipoMenuEnum getTipoMenu() {
        return enumTipoMenu;
    }

    public void setTipoMenu(TipoMenuEnum enumTipoMenu) {
        this.enumTipoMenu = enumTipoMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public TipoMenuEnum getEnumTipoMenu() {
        return enumTipoMenu;
    }

    public void setEnumTipoMenu(TipoMenuEnum enumTipoMenu) {
        this.enumTipoMenu = enumTipoMenu;
    }

    public void printAllMenu() {
        System.out.println(getNomeMenu());
        System.out.println(getTipoMenu());
        for (Portata portata : listaPortata) {
            portata.printPortataDetail();
        }
    }

        }



