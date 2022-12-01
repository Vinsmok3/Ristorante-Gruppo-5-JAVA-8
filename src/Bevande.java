public class Bevande extends Portata {

    private boolean isAlcolic;

    public Bevande(String type, String name, Integer price) {
        super(type, name, price);
    }
    public Bevande(String type, String name, Integer price, boolean isAlcolic) {
        super(type, name, price);
        this.isAlcolic = isAlcolic;
    }


    //TODO il metodo to string non serve per stampare i dettagli : 12234343@hascode
    //MAI per dettagli maiii
    /*@Override
    public String toString(){
        return "Tipo: " + getType() + " - " + "Nome: " + getName() + " - " + "Prezzo: " + getPrice() + " - " + isDrinkWithAlcool() + "\n";
    }*/

    //TODO se è is allora torna un boolean, questo metodo torna una stringa e quindi si chiamerà getIsDrinkecc...
    //siamo sicuri che deve tornare una stringa come lo usiamo questo metodo? forse volevamo stampare il tipo di drink?

    /*public String isDrinkWithAlcool(){
        if (isAlcolic){
            return "è alcolico";
        }else
        return "non è alcolico";
    }*/

    @Override
    public void printPortataDetail() {
        super.printPortataDetail();
    }

  }
