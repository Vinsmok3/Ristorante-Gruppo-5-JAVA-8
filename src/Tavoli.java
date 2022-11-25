public class Tavoli extends ListaClientieTavoli{
    private int number;
    private int chairs;
    private boolean isOutside;

    public Tavoli(int number, int chairs, boolean isOutside) {
        this.number = number;
        this.chairs = chairs;
        this.isOutside = isOutside;
    }
    public String isOutside(){
        if(isOutside){
            return "il tavolo è all'aperto";
        }else
            return "il tavolo è al coperto";

    }

    @Override
    public String toString() {
        return
                "NUMERO: " + number + "\s" + " - " +
                "SEDIE: " + chairs + "\s" + " - " +
                "E' FUORI?: " + isOutside();
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

    public void setOutside(boolean outside) {
        isOutside = outside;
    }
}
