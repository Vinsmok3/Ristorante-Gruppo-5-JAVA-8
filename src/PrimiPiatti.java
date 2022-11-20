import java.util.Arrays;

public class PrimiPiatti {
    public String portata1;
    public String portata2;
    public String portata3;

    public PrimiPiatti(String portata1, String portata2, String portata3) {
        this.portata1 = portata1;
        this.portata2 = portata2;
        this.portata3 = portata3;
    }

    @Override
    public String toString() {
        return "Primi Piatti" +
                "\n" + portata1  +
                "\n" + portata2 +
                "\n" + portata3
                ;
    }

    public String getPortata1() {
        return portata1;
    }

    public void setPortata1(String portata1) {
        this.portata1 = portata1;
    }

    public String getPortata2() {
        return portata2;
    }

    public void setPortata2(String portata2) {
        this.portata2 = portata2;
    }

    public String getPortata3() {
        return portata3;
    }

    public void setPortata3(String portata3) {
        this.portata3 = portata3;
    }
}
