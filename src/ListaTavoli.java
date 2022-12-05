public class ListaTavoli {

    private int number;
    private int chairs;

    public ListaTavoli(int number, int chairs) {
        this.number = number;
        this.chairs = chairs;
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
        System.out.println(getNumber() + " " + getChairs());
    }


}
