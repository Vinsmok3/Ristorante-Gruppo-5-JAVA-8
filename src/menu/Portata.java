package menu;

public class Portata {
    private String type;

    private String name;

    private double price;

    //TODO tipoPortataEnum per cleaning code
    private EnumTipoPortata tipoPortata;

    public Portata(String type, String name, double price, EnumTipoPortata tipoPortata) {
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

    public EnumTipoPortata getTipoPortata() {
        return tipoPortata;
    }

    public void setTipoPortata(EnumTipoPortata tipoPortata) {
        this.tipoPortata = tipoPortata;
    }

    public String printPortataDetail() {
        return "Tipo :" + " " + type + " - " + "Nome: " + name + " - " + "Prezzo: " + price+ " - Tipo portata: "+ tipoPortata.getDescription() ;
    }
}