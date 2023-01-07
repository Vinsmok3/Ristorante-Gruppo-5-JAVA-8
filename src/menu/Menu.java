package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO spostare tutto da ristornate a menù come abbiamo parlato alla call

    private final List<Portata> listaPortata = new ArrayList<>();
    private List<TypesEnum> type;
    private String nomeMenu;
    private EnumTipoMenu enumTipoMenu;
    private EnumTipoDrink tipoDrink;

    //TODO inserire il tipo TypesEnum
    public Menu(EnumTipoMenu enumTipoMenu, String nomeMenu) {
        this.enumTipoMenu = enumTipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public List<TypesEnum> getType() {
        return type;
    }

    public void setType(List<TypesEnum> type) {
        this.type = type;
    }

    public EnumTipoMenu getTipoMenu() {
        return enumTipoMenu;
    }

    public void setTipoMenu(EnumTipoMenu enumTipoMenu) {
        this.enumTipoMenu = enumTipoMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public EnumTipoMenu getEnumTipoMenu() {
        return enumTipoMenu;
    }

    public void setEnumTipoMenu(EnumTipoMenu enumTipoMenu) {
        this.enumTipoMenu = enumTipoMenu;
    }

    //TODO la stampa del menù deve comprendere tutto
    //rinominare
    public void printAllMenu() {
        System.out.println(getNomeMenu());
        System.out.println(getTipoMenu());
        for (Portata portata : listaPortata) {
            portata.printPortataDetail();
        }
    }

        }



