
public class PrimiPiatti extends Portata{
    private boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price) {
        super(type, name, price);
    }

    //TODO se il field è booelan va passato al boolean di solito lo stardard è lo stesso nome
    public PrimiPiatti(String type, String name, Integer price, Boolean glutenFree) {
        super(type, name, price);
        //TODO non si fa così sistemare con il this
        this.glutenFree = glutenFree;

    }

    /*@Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + hasGlutenFree() + "\n";
        //return String.format("Tipo %s Nome %s Prezzo %d hasGlutenfree %b ", getType(),getName(),getPrice(),hasGlutenFree());
    }*/

    public String hasGlutenFree(){
        if (glutenFree){
            return "Contiene il glutine";
        }else {
            return "Senza glutine";
        }
    }
}
