package Menu;

import java.util.List;

public class SecondiPiatti extends Portata {


    //TODO stessa cosa delle altre classi
    private boolean isFresh;

    public SecondiPiatti(String type, String name, Integer price, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
    }

    public SecondiPiatti(String type, String name, Integer price, boolean isFresh,EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
        this.isFresh = isFresh;
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + getFishInfo()+" - Tipo portata: "+ getTipoPortata());
    }

    //TODO stessa cosa qui
    public String getFishInfo() {
        if (isFresh) {
            return " - Pescato del giorno.";
        } else {
            return "";
        }


    }
}