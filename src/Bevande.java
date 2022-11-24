public class Bevande extends Portata {

    public boolean isAlcoholic;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }
    public Bevande(String type, String name, Integer price,boolean isAlcoholic) {
        super(type, name, price);
        this.isAlcoholic = isAlcoholic;
    }

    @Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + isDrinkWithAlcohol();
    }

    public String isDrinkWithAlcohol(){
        if (isAlcoholic){
            return "è alcolico";
        }else
        return "non è alcolico";
    }

}
