package Menu;

public class Bevande extends Portata {

    private int alcoholicStrength;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }

    public Bevande(String type, String name, Integer price, int alcoholicStrength) {
        super(type, name, price);
        this.alcoholicStrength = alcoholicStrength;
    }

    public String getAlcoolInfo() {
        if (alcoholicStrength > 0) {
            return "- Grado Alcolico: " + alcoholicStrength + "%";
        }
        return "";
    }

    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + getAlcoolInfo());
    }
}
