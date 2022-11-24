

public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica","Pesce", "4 Uomini e un pesce");
        ListaClienti listClienti = new ListaClienti();

        Portata bevanda1 = new Bevande("Vino", "Tavernello",20, true);
        Portata bevanda2 = new Bevande("Acqua", "Levissima", 10,false);

        Cliente cliente1 = new Cliente("Paul","Cannon",333333338, true);








        menu.addBevanda(bevanda1);
        menu.addBevanda(bevanda2);
        menu.printAllMenu();

        listClienti.addClient(cliente1);
        listClienti.printAllClients();


    }
}
