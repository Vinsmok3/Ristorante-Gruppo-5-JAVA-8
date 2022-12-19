package Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO spostare tutto da ristornate a menù come abbiamo parlato alla call

    private List<Portata> listaPortata = new ArrayList<>();
    private List<EnumTipoMenu> type;
    private String tipoMenu;
    private String nomeMenu;

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

    public List<EnumTipoMenu> getType() {
        return type;
    }

    public void setType(List<EnumTipoMenu> type) {
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

