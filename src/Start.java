

public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");
        ListaClientieTavoli listaClientieTavoli = new ListaClientieTavoli();

        Portata bevanda1 = new Bevande("Vino", "Tavernello",20, true);
        Portata bevanda2 = new Bevande("Acqua", "Levissima", 10,false);
        Portata primo1 = new PrimiPiatti("Spaghetti", "Pasta con le cozze", 23,true);
        Portata primo2 = new PrimiPiatti("Penne","Pasta con le vongole",25,true);
        Portata primo3 = new PrimiPiatti("Farfalle", "Farfalle con il salmone",18,false);
        Portata secondi1 = new SecondiPiatti("a fette", "pesce spada", 25, true  );
        Portata secondi2 = new SecondiPiatti("frittura", "mix di calamari e gamberi",10,false);
        Portata dolce1 = new Dolci("Semi-freddo", "Parfait di mandorle", 10, true);
        Portata dolce2 = new Dolci("A freddo", "Tiramisù", 22, true);


        Cliente cliente1 = new Cliente("Paul","Cannon",333333338, true);

        Tavoli tavoli1 = new Tavoli(1,1,true);

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
        System.out.println("----------LISTA CLIENTI----------");
        listaClientieTavoli.addClient(cliente1);
        listaClientieTavoli.printAllClients();
        System.out.println("----------LISTA TAVOLI-----------");
        listaClientieTavoli.addTavoli(tavoli1);
        listaClientieTavoli.printAllTavoli();
    }
}
