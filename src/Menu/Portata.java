package Menu;

public class Portata {
    private String type;

    private String name;

    private double price;

    //TODO tipoPortataEnum per cleaning code
    private EnumTipoMenu tipoPortata;

    public Portata(String type, String name, double price, EnumTipoMenu tipoPortata) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.tipoPortata = tipoPortata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnumTipoMenu getTipoPortata() {
        return tipoPortata;
    }

    public void setTipoPortata(EnumTipoMenu tipoPortata) {
        this.tipoPortata = tipoPortata;
    }

    public void printPortataDetail() {
        System.out.println("Tipo :" + " " + type + " - " + "Nome: " + name + " - " + "Prezzo: " + price+ " - Tipo portata: "+tipoPortata.getDescripition());
    }
}
