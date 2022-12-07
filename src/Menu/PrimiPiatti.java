package Menu;

public class PrimiPiatti extends Portata {
    private boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price) {
        super(type, name, price);
    }

    //TODO se il field è booelan va passato al boolean di solito lo stardard è lo stesso nome
    public PrimiPiatti(String type, String name, Integer price, boolean glutenFree) {
        super(type, name, price);
        //TODO non si fa così sistemare con il this
        this.glutenFree = glutenFree;
    }
    public String isGlutenFree() {
        if (glutenFree) {
            return "- Contiene il glutine";
        } else {
            return "- Senza glutine";
        }
    }
    @Override
    public void printPortataDetail() {
        System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + isGlutenFree());
    }
}

