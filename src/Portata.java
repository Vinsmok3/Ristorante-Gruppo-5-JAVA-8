public class Portata {
    //TODO cleaning code l'ho fatto io, vedere come si fa da intellj
    private String type;

    private String name;

    private double price;

    public Portata(String type, String name, Integer price) {
        this.type = type;
        this.name = name;
        this.price = price;
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

    //TODO come faccioa a capire a video chi è type name e price? magari su la stessa riga
    public void printPortataDetail() {
        System.out.println(type);
        System.out.println(name);
        System.out.println(price);
    }
}
