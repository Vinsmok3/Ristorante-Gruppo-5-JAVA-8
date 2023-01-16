package menu;

public class SecondiPiatti extends Portata {


    private boolean isFresh;

    public SecondiPiatti(String type, String name, Integer price, boolean isFresh, TipoPortataEnum tipoPortata) {
        super(type, name, price, tipoPortata);
        this.isFresh = isFresh;
    }

    @Override
    public void printPortataDetail() {
        if (isFresh) {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + "- (Pescato del giorno) " + " - Tipo portata: " + getTipoPortata());
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + "- (Pesce surgelato) " + " - Tipo portata: " + getTipoPortata());
        }
    }
}