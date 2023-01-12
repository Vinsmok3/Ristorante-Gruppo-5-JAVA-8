package menu;

public class Portata {
    private String type;

    private String name;

    private double price;

    private TipoPortataEnum tipoPortata;

    public Portata(String type, String name, double price, TipoPortataEnum tipoPortata) {
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

    public TipoPortataEnum getTipoPortata() {
        return tipoPortata;
    }

    public void setTipoPortata(TipoPortataEnum tipoPortata) {
        this.tipoPortata = tipoPortata;
    }

    //TODO modificare gli altri metodi
    public void printPortataDetail() {
        System.out.println("Tipo :" + " " + type + " - " + "Nome: " + name + " - " + "Prezzo: " + price+ " - Tipo portata: "+ tipoPortata.getDescription());
    }
}
