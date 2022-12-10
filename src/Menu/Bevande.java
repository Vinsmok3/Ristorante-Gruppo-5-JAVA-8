package Menu;

import java.util.List;

public class Bevande extends Portata {

    private int alcoholicStrength;

    public Bevande(String type, String name, Integer price,EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
    }

    public Bevande(String type, String name, Integer price, int alcoholicStrength, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
        this.alcoholicStrength = alcoholicStrength;
    }

    public String getAlcoolInfo() {
        if (alcoholicStrength > 0) {
            return "- Grado Alcolico: " + alcoholicStrength + "%";
        }
        return "";
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + getAlcoolInfo() +" - Tipo portata: "+ getTipoPortata());
    }
}
