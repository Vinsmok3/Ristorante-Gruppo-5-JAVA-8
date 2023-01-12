package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Portata> listaPortata = new ArrayList<>();
    private List<TipoPortataEnum> type;
    private String nomeMenu;
    private TipoMenuEnum enumTipoMenu;
    private TipoDrinkEnum tipoDrink;

    public Menu(TipoMenuEnum enumTipoMenu, String nomeMenu) {
        this.enumTipoMenu = enumTipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public List<TipoPortataEnum> getType() {
        return type;
    }

    public void setType(List<TipoPortataEnum> type) {
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

    //TODO la stampa del menù deve comprendere tutto
    public void printAllMenu() {
        System.out.println(getNomeMenu());
        System.out.println(getTipoMenu());
        for (Portata portata : listaPortata) {
            portata.printPortataDetail();
        }
    }

        }



