public class Bevande extends Portata {

    public boolean isAlcolic;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }
    public Bevande(String type, String name, Integer price, boolean isAlcolic) {
        super(type, name, price);
    }

    @Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + isDrinkWithAlcool();
    }

    public String isDrinkWithAlcool(){
        if (isAlcolic){
            return "è alcolico";
        }else
        return "non è alcolico";
    }

}
