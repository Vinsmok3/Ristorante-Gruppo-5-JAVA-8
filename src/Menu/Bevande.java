package Menu;

import java.util.List;

public class Bevande extends Portata {

    private boolean isAlcoholic;

    public Bevande(String type, String name, Integer price, boolean isAlcoholic, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
        this.isAlcoholic = isAlcoholic;
    }


    public String printAlcoholInfo() {
        if (isAlcoholic) {
            return "Alcolico";
        }else return "Analcolico";
    }

    /*public void printAlcoholInfo() {
        if (isAlcoholic) {
            System.out.println("Alcolico");
        }else System.out.println("Analcolico");
    }*/

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo portata: " + getTipoPortata());
    }
}
