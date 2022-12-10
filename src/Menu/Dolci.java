package Menu;

import java.util.List;

public class Dolci extends Portata {

    private boolean isHomeMade;

    public Dolci(String type, String name, Integer price, EnumTipoMenu tipoPortata) {
        super(type, name, price,tipoPortata);
    }

    public Dolci(String type, String name, Integer price, boolean isHomeMade,EnumTipoMenu tipoPortata) {
        super(type, name, price, tipoPortata);
        this.isHomeMade = isHomeMade;
    }

    public String isSweetHomeMade() {
        if (isHomeMade) {
            return "- è fatto in casa";
        } else return "- non è fatto in casa";
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + isSweetHomeMade()+" - Tipo portata: "+ getTipoPortata());
    }

}





