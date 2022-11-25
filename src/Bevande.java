public class Bevande extends Portata {

    private boolean isAlcolic;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }
    public Bevande(String type, String name, Integer price, boolean isAlcolic) {
        super(type, name, price);
        this.isAlcolic = isAlcolic;
    }

    @Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + isDrinkWithAlcool() + "\n";
    }

    public String isDrinkWithAlcool(){
        if (isAlcolic){
            return "è alcolico";
        }else
        return "non è alcolico";
    }

}
