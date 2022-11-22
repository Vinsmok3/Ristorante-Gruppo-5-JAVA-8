public class Bevande extends Portata {

    public boolean isAlcolic;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }
    public Bevande(String type, String name, Integer price, boolean isAlcolic) {
        super(type, name, price);
    }

    public String isDrinkWithAlcool(){
        if (isAlcolic){
            return "è alcolico";
        }
        return "non è alcolico";
    }
}
