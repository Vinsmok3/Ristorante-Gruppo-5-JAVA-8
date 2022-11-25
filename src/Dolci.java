public class Dolci extends Portata {

    private boolean isHomeMade;

    public Dolci(String type, String name, Integer price) {
        super(type, name, price);
    }

    public Dolci(String type, String name, Integer price, boolean isHomeMade) {
        super(type, name, price);
        this.isHomeMade = isHomeMade;
    }

    @Override
    public String toString() {
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + isSweetHomeMade() + "\n";
    }

    public String isSweetHomeMade() {
        if (isHomeMade) {
            return "è fatto in casa";
        } else
            return "non è fatto in casa";
    }

}





