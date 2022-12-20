package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO spostare tutto da ristornate a menù come abbiamo parlato alla call

    private List<Portata> listaPortata = new ArrayList<>();
    private List<EnumTipoPortata> type;
    private String tipoMenu;
    private String nomeMenu;
    private EnumTipoPortata enumTipoMenu;
    private EnumTipoDrink tipoDrink;

    public Menu(String tipoMenu, String nomeMenu) {
        this.tipoMenu = tipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public List<EnumTipoPortata> getType() {
        return type;
    }

    public void setType(List<EnumTipoPortata> type) {
        this.type = type;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public EnumTipoPortata getEnumTipoMenu() {
        return enumTipoMenu;
    }

    public void setEnumTipoMenu(EnumTipoPortata enumTipoMenu) {
        this.enumTipoMenu = enumTipoMenu;
    }

    //TODO la stampa del menù deve comprendere tutto
    //rinominare
    public void printAllMenu() {
        System.out.println(getNomeMenu());
        System.out.println(getTipoMenu());
        for (Portata portata : listaPortata) {
            System.out.println(portata.printPortataDetail());
        }
    }
    // INUTILE SE AGGIUNGIAMO MANUALMENTE OGNI PORTATA AD OGNI MENU
    public void printChildMenu(){
        for(Portata portata : listaPortata){
            if (enumTipoMenu == EnumTipoPortata.BAMBINO && tipoDrink == EnumTipoDrink.ANALCOLICO) {
                System.out.println(portata.printPortataDetail());
            }
        }
    }
}

