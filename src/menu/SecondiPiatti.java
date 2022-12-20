package menu;

public class SecondiPiatti extends Portata {


    private boolean isFresh;

    public SecondiPiatti(String type, String name, Integer price, boolean isFresh, TypesEnum tipoPortata) {
        super(type, name, price, tipoPortata);
        this.isFresh = isFresh;
    }

    @Override
    public String printPortataDetail() {
        if (isFresh == true) {
            return getType() + getName() + " - " + "Prezzo: " + getPrice() + "- (Pescato del giorno) " + " - Tipo portata: " + getTipoPortata();
        } else {
            return getType() + getName() + " - " + "Prezzo: " + getPrice() + "- (Pesce surgelato) " + " - Tipo portata: " + getTipoPortata();
        }
    }
}