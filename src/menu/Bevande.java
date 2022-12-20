package menu;

public class Bevande extends Portata {

    private boolean isAlcoholic;
    private double grades;
    private EnumTipoDrink tipoDrink;

    public Bevande(String type, String name, Integer price, boolean isAlcoholic, EnumTipoPortata tipoPortata, EnumTipoDrink tipoDrink, double grades) {
        super(type, name, price, tipoPortata);
        this.tipoDrink = tipoDrink;
        this.isAlcoholic = isAlcoholic;
    }


    public String printAlcoholInfo() {
        if (isAlcoholic) {
            return "Alcolico " + grades;
        } else return "Analcolico";
    }

    /*public void printAlcoholInfo() {
        if (isAlcoholic) {
            System.out.println("Alcolico");
        }else System.out.println("Analcolico");
    }*/

    @Override
    public String printPortataDetail() {
        if (tipoDrink == EnumTipoDrink.ANALCOLICO) {
            return getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink;
        } else {
            return getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink + " con " + grades + " gradi.";
        }
    }
}
