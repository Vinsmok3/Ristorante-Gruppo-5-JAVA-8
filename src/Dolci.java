public class Dolci extends Portata{

    public String dolce1;
    public String dolce2;
    public String dolce3;

    public Dolci(String dolce1, String dolce2, String dolce3) {
        this.dolce1 = dolce1;
        this.dolce2 = dolce2;
        this.dolce3 = dolce3;
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
