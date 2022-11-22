public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");
       // Portata pesce = new PrimiPiatti("Pasta con le cozze", "Pasta allo scoglio", "Pasta con i gamberi");
        //Portata pesce2 = new SecondiPiatti("pepata di cozze", "gamberoni fritti", "frittura pesce mista");
        //Dolci dolci = new Dolci("Parfait di mandorle", "Tiramisù", "Bignè");
        Portata bevande = new Bevande("Acqua", "Vino",12);

        menu.addPortata(bevande);
        menu.printAllMenu();

    }
}
