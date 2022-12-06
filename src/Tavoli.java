public class Tavoli extends ListaTavoli {
    //TODO riflettere sul final!
    private final boolean isOutside;

    public Tavoli(int number, int chairs, boolean isOutside) {
        super(number, chairs);
        this.isOutside = isOutside;
    }


    //TODO va fatto con il booleano
    public String isOutside() {
        if (isOutside) {
            return "Il tavolo è all'aperto";
        } else
            return "Il tavolo è al coperto";

    }

    @Override
    public void printAllTables() {
        System.out.println("Numero Tavolo: " + getNumber() + " - " + "Numero sedie: " + getChairs() + " - " + isOutside());
    }
}
