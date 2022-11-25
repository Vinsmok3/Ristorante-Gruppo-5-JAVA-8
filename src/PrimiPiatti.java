
public class PrimiPiatti extends Portata{
    private boolean glutenFree;

    public PrimiPiatti(String type, String name, Integer price) {
        super(type, name, price);
    }
    public PrimiPiatti(String type, String name, Integer price, Boolean hasGluten) {
        super(type, name, price);
        glutenFree = hasGluten;

    }

    @Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + hasGlutenFree() + "\n";
        //return String.format("Tipo %s Nome %s Prezzo %d hasGlutenfree %b ", getType(),getName(),getPrice(),hasGlutenFree());
    }

    public String hasGlutenFree(){
        if (glutenFree){
            return "Contiene il glutine";
        }else {
            return "Senza glutine";
        }
    }
}
