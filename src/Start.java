public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");
        PrimiPiatti pesce = new PrimiPiatti("Pasta con le cozze", "Pasta allo scoglio", "Pasta con i gamberi");
        SecondiPiatti pesce2 = new SecondiPiatti("pepata di cozze", "gamberoni fritti", "frittura pesce mista");
        Bevande bevande = new Bevande("Acqua", "Vino", "Birra");
        System.out.println(menu.completeMenu);
        System.out.println("-------------------------------------");
        System.out.println(pesce);
        System.out.println("--------------------------------------");
        System.out.println(pesce2);
        System.out.println("--------------------------------------");
        System.out.println(bevande);
    }
}
