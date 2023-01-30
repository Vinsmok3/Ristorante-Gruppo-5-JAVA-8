package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO aggiungere la somma delle portate in euro, in dollari, ecc ecc
    private final List<Portata> listaPortata = new ArrayList<>();
    private List<TipoEnum> type;
    private String nomeMenu;
    private int idMenu;
    private TipoMenuEnum enumTipoMenu;
    private TipoDrinkEnum tipoDrink;
    private final String url = "jdbc:mysql://localhost:3306/ristorantedb";
    private final String user = "root";
    private final String password = "password";

    public Menu(TipoMenuEnum enumTipoMenu, int idMenu) {
        this.enumTipoMenu = enumTipoMenu;
        this.idMenu = idMenu;
    }



    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
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



