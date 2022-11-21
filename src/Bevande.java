public class Bevande {
    public String bevanda1;
    public String bevanda2;
    public String bevanda3;

    public Bevande(String bevanda1, String bevanda2, String bevanda3) {
        this.bevanda1 = bevanda1;
        this.bevanda2 = bevanda2;
        this.bevanda3 = bevanda3;
    }

    @Override
    public String toString() {
        return "Bevande" +
                "\n" + bevanda1  +
                "\n" + bevanda2 +
                "\n" + bevanda3
                ;
    }
}
