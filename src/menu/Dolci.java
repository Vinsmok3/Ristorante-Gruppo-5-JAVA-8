package menu;

public class Dolci extends Portata {


    private boolean isHomeMade;


    public Dolci(String type, String name, Integer price, TipoPortataEnum tipoPortata, boolean isHomeMade) {
        super(type, name, price, tipoPortata);
        this.isHomeMade = isHomeMade;
    }

    /*public String getSweetHomeMadeInfo() {
        if (isHomeMade) {
            return "- Fatto in casa";
        } else return "- Non è fatto in casa";
    }*/

    @Override
    public void printPortataDetail() {
        if (isHomeMade) {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Fatto In Casa" + " - Tipo portata: " + getTipoPortata());
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + "Non Fatto In Casa" + " - Tipo portata: " + getTipoPortata());
        }

    }
}





