public class SecondiPiatti {


    public String primaportata ;
    public String secondaportata;
    public String terzaportata;

    public SecondiPiatti(String primaportata, String secondaportata, String terzaportata) {
        this.primaportata = primaportata;
        this.secondaportata = secondaportata;
        this.terzaportata = terzaportata;

    }

    @Override
    public String toString() {
        return "Secondi Piatti" +
                 "\n" + primaportata +
                 "\n" +  secondaportata +
                "\n" + terzaportata
                ;
    }
}
