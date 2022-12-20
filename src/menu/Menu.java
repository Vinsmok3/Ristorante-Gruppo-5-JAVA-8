package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO spostare tutto da ristornate a menù come abbiamo parlato alla call

    private List<Portata> listaPortata = new ArrayList<>();
    private List<TypesEnum> type;
    private String tipoMenu;
    private String nomeMenu;
    private TypesEnum enumTipoMenu;
    private EnumTipoDrink tipoDrink;

    //TODO inserire il tipo TypesEnum
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

    public List<TypesEnum> getType() {
        return type;
    }

    public void setType(List<TypesEnum> type) {
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

    public TypesEnum getEnumTipoMenu() {
        return enumTipoMenu;
    }

    public void setEnumTipoMenu(TypesEnum enumTipoMenu) {
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
    public void printChildMenu(){
        for(Portata portata : listaPortata){
            if (enumTipoMenu == TypesEnum.BAMBINO && tipoDrink == EnumTipoDrink.ANALCOLICO) {
                System.out.println(portata.printPortataDetail());
            }
        }
    }
}

