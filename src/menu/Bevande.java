package menu;

public class Bevande extends Portata {

    private boolean isAlcoholic;
    private double grades;
    private EnumTipoDrink tipoDrink;

    public Bevande(String type, String name, Integer price, boolean isAlcoholic, TypesEnum tipoPortata, EnumTipoDrink tipoDrink, double grades) {
        super(type, name, price, tipoPortata);
        this.tipoDrink = tipoDrink;
        this.isAlcoholic = isAlcoholic;
        this.grades = grades;
    }


    public String printAlcoholInfo() {
        if (isAlcoholic) {
            return "Alcolico " + grades;
        } else return "Analcolico";
    }

    @Override
    public void printPortataDetail() {
        if (tipoDrink == EnumTipoDrink.ANALCOLICO) {
           System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink);
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink + " con " + grades + " gradi.");
        }
    }
}
