public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");

       // Portata pesce = new PrimiPiatti("Pasta con le cozze", "Pasta allo scoglio", "Pasta con i gamberi");
        //Portata pesce2 = new SecondiPiatti("pepata di cozze", "gamberoni fritti", "frittura pesce mista");
        //Dolci dolci = new Dolci("Parfait di mandorle", "Tiramisù", "Bignè");
        Portata bevanda1 = new Bevande("Vino", "Tavernello",20,true);
        Portata bevanda2 = new Bevande("Acqua", "Levissima", 10,false);


        menu.addBevanda(bevanda1);
        menu.addBevanda(bevanda2);
        menu.printAllMenu();



    }
}
