public class Portata {

        private String type;

        private String name;

        double price;

        public Portata(String type, String name,Integer price){
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

    public void printPortataDetail(){
        System.out.println(type);
        System.out.println(name);
        System.out.println(price);
    }
}
