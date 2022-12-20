package menu;

public class PrimiPiatti extends Portata {
    private boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price, boolean glutenFree, TypesEnum tipoPortata) {
        super(type, name, price, tipoPortata);
        this.glutenFree = glutenFree;
    }

    //TODO booleano e metodo void
    public String getGlutenInfo() {
        if (glutenFree) {
            return "- Contiene il glutine";
        } else {
            return "- Senza glutine";
        }
    }

    @Override
    public String printPortataDetail() {
        return getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + getGlutenInfo() + " - Tipo portata: " + getTipoPortata();
    }
}

