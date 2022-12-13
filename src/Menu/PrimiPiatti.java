package Menu;

import java.util.List;

public class PrimiPiatti extends Portata {
    private boolean glutenFree;

    //TODO
    public PrimiPiatti(String type, String name, Integer price, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
    }

    public PrimiPiatti(String type, String name, Integer price, boolean glutenFree,EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
        this.glutenFree = glutenFree;
    }

    //TODO booleano e metodo void
    public String isGlutenFree() {
        if (glutenFree) {
            return "- Contiene il glutine";
        } else {
            return "- Senza glutine";
        }
    }
    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + isGlutenFree()+" - Tipo portata: "+ getTipoPortata());
    }
}

