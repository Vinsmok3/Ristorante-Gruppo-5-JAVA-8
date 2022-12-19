package Menu;

import java.util.List;

public class Dolci extends Portata {

    private boolean isHomeMade;


    public Dolci(String type, String name, Integer price, boolean isHomeMade, EnumTipoMenu tipoPortata) {
        super(type, name, price, tipoPortata);
        this.isHomeMade = isHomeMade;
    }

    public String getSweetHomeMadeInfo() {
        if (isHomeMade) {
            return "- Fatto in casa";
        } else return "- Non è fatto in casa";
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + getSweetHomeMadeInfo() + " - Tipo portata: " + getTipoPortata());
    }

}





