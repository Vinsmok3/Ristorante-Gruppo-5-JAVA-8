

public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");
        ListaClienti listClienti = new ListaClienti();

        Portata bevanda1 = new Bevande("Vino", "Tavernello",20, true);
        Portata bevanda2 = new Bevande("Acqua", "Levissima", 10,false);
        Portata primo1 = new PrimiPiatti("Spaghetti", "Pasta con le cozze", 23,true);
        Portata primo2 = new PrimiPiatti("Penne","Pasta con le vongole",25,true);
        Portata primo3 = new PrimiPiatti("Farfalle", "Farfalle con il salmone",18,false);
        Portata dolce1 = new Dolci("Semi-freddo", "Parfait di mandorle", 10, true);
        Portata dolce2 = new Dolci("A freddo", "Tiramisù", 22, true);
        Portata secondi1 = new SecondiPiatti("a fette", "pesce spada", 25, true  );
        Portata secondi2 = new SecondiPiatti("frittura", "mix di calamari e gamberi",10,false);

        Cliente cliente1 = new Cliente("Paul","Cannon",333333338, true);
        menu.addPrimi(primo1);
        menu.addPrimi(primo2);
        menu.addPrimi(primo3);
        menu.addDolci(dolce1);
        menu.addDolci(dolce2);
        menu.addBevanda(bevanda1);
        menu.addBevanda(bevanda2);
        menu.addSecondi(secondi1);
        menu.addSecondi(secondi2);
        menu.printAllMenu();

        listClienti.addClient(cliente1);
        listClienti.printAllClients();
    }
}
