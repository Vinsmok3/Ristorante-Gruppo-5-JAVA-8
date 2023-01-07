package tableRestaurant;

public class Tavoli{

    private final boolean isOutside;
    private int number;
    private int chairs;


    public Tavoli(int number, int chairs, boolean isOutside) {
        this.number = number;
        this.chairs = chairs;
        this.isOutside = isOutside;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }


    public void printAllTables() {
        System.out.println("Numero Tavolo: " + getNumber() + " - " + "Numero sedie: " + getChairs() + " - " + "Il tavolo é fuori?: " + isOutside);
    }
}
