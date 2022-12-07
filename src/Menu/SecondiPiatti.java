package Menu;

public class SecondiPiatti extends Portata {

    private boolean isFresh;

    public SecondiPiatti(String type, String name, Integer price) {
        super(type, name, price);
    }

    public SecondiPiatti(String type, String name, Integer price, boolean isFresh) {
        super(type, name, price);
        this.isFresh = isFresh;
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + getFishInfo());
    }

    public String getFishInfo() {
        if (isFresh) {
            return " - Pescato del giorno.";
        } else {
            return "";
        }


    }
}