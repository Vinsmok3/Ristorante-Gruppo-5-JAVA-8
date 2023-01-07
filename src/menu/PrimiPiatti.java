package menu;

public class PrimiPiatti extends Portata {
    private final boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price, boolean glutenFree, TypesEnum tipoPortata) {
        super(type, name, price, tipoPortata);
        this.glutenFree = glutenFree;
    }

    //TODO booleano e metodo void
    /*public boolean isGlutenFree() {
        if (glutenFree) {
            return true;
        } else {
            return false;
        }
    }*/

    @Override
    public void printPortataDetail() {
        if (glutenFree) {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Senza Glutine" + " - Tipo portata: " + getTipoPortata());
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Con Glutine" + " - Tipo portata: " + getTipoPortata());
        }
    }
}

