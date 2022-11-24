public class Dolci extends Portata{

    private String dolce1;
    private String dolce2;
    private String dolce3;

    public Dolci(String type, String name, Integer price) {
        super(type, name, price);
    }


    @Override
    public String toString() {
        return "Dolci" +
                "\n" + dolce1 +
                "\n" + dolce2 +
                "\n" + dolce3
                ;
    }
}
