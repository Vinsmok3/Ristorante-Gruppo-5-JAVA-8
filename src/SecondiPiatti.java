public class SecondiPiatti extends Portata {

    private boolean hasfresh;

    public SecondiPiatti(String type, String name, Integer price) {
        super(type, name, price);
    }

    public SecondiPiatti(String type, String name, Integer price, boolean hasfresh) {
        super(type, name, price);
        this.hasfresh = hasfresh;
    }

    /*@Override
    public String toString() {
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + hasfresh() + "\n";
    }*/

    public String hasfresh() {
        if (hasfresh) {
            return "il pesce è fresco";
        } else {
            return "il pesce non è fresco";
        }


    }
}