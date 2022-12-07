import Client.Cliente;
import Menu.*;
import TableRestaurant.Ristorante;
import TableRestaurant.Tavoli;

public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu("Ammutta Muddica", "Pesce", "4 Uomini e un pesce");
        Ristorante ristorante = new Ristorante("Ammutta Muddica", "Pesce", "4 Uomini e un pesce");

        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, 9);
        Portata bevanda2 = new Bevande("BEVANDA: ", "Acqua", 10);
        Portata primo1 = new PrimiPiatti("PRIMI: ", "Pasta con le cozze", 23, true);
        Portata primo2 = new PrimiPiatti("PRIMI: ", "Pasta con le vongole", 25, true);
        Portata primo3 = new PrimiPiatti("PRIMI: ", "Farfalle con il salmone", 18, false);
        Portata secondi1 = new SecondiPiatti("SECONDI: ", "Pesce Spada", 25, true);
        Portata secondi2 = new SecondiPiatti("SECONDI: ", "Frittura di calamari e gamberi", 10, false);
        Portata dolce1 = new Dolci("DOLCE: ", "Parfait di mandorle", 10, true);
        Portata dolce2 = new Dolci("DOLCE: ", "Tiramisù", 22, false);

        Cliente cliente1 = new Cliente("Paul", "Cannon", 333333338); // il phonenumber dopo 9 numeri da errore.

        Tavoli tavoli1 = new Tavoli(1, 2, true);

        menu.addPortata(primo1);
        menu.addPortata(primo2);
        menu.addPortata(primo3);
        menu.addPortata(secondi1);
        menu.addPortata(secondi2);
        menu.addPortata(dolce1);
        menu.addPortata(dolce2);
        menu.addPortata(bevanda1);
        menu.addPortata(bevanda2);
        menu.printAllMenu();
        System.out.println("----------LISTA CLIENTI----------");
        ristorante.addClient(cliente1);
        ristorante.printAllClients();
        System.out.println("----------LISTA TAVOLI-----------");
        ristorante.addTavoli(tavoli1);
        ristorante.printAllTables();
        //ristorante.printAllMenu();
    }
}
