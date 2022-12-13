package Menu;

import java.util.List;

public class Bevande extends Portata {

    //TODO usare un booleano e eliminare il costruttore in più, rivediamo un po questo approccio
    private int alcoholicStrength;

    private boolean isAlcoholic;

    public Bevande(String type, String name, Integer price,EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
    }

    public Bevande(String type, String name, Integer price, int alcoholicStrength, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
        this.alcoholicStrength = alcoholicStrength;
    }

    //TODO mai far tornare stringa vuota o null, da completare
    public void printAlcoolInfo() {
        if (alcoholicStrength > 0) {
            System.out.println("- Grado Alcolico: " + alcoholicStrength + "%");
        }
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + getAlcoolInfo() +" - Tipo portata: "+ getTipoPortata());
    }
}
