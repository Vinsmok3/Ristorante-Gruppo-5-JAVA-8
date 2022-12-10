import Client.Cliente;
import Menu.*;
import TableRestaurant.Ristorante;
import TableRestaurant.Tavoli;

public class Start {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Ristorante ristorante = new Ristorante("Ammutta Muddica", "Pesce", "4 Uomini e un pesce");

        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, 9, EnumTipoMenu.ALCOLICO);
        Portata bevanda2 = new Bevande("BEVANDA: ", "Acqua", 10,EnumTipoMenu.ANALCOLICO);
        Portata primo1 = new PrimiPiatti("PRIMI: ", "Pasta con le cozze", 23, true,EnumTipoMenu.CLASSICO);
        Portata primo2 = new PrimiPiatti("PRIMI: ", "Pasta con le vongole", 25, true,EnumTipoMenu.CLASSICO);
        Portata primo3 = new PrimiPiatti("PRIMI: ", "Farfalle con il salmone", 18, false,EnumTipoMenu.BAMBINO_CLASSICO);
        Portata secondi1 = new SecondiPiatti("SECONDI: ", "Pesce Spada", 25, true,EnumTipoMenu.CLASSICO);
        Portata secondi2 = new SecondiPiatti("SECONDI: ", "Frittura di calamari e gamberi", 10, false,EnumTipoMenu.CLASSICO);
        Portata dolce1 = new Dolci("DOLCE: ", "Parfait di mandorle", 10, true,EnumTipoMenu.BAMBINO_CLASSICO);
        Portata dolce2 = new Dolci("DOLCE: ", "Tiramisù", 22, false,EnumTipoMenu.CLASSICO);

        Cliente cliente1 = new Cliente("Paul", "Cannon", "+ 39 3960382722");

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
        ristorante.infoRistorante();
        //ristorante.printAllMenu();
        System.out.println("----------LISTA CLIENTI----------");
        ristorante.addClient(cliente1);
        ristorante.printAllClients();
        System.out.println("----------LISTA TAVOLI-----------");
        ristorante.addTavoli(tavoli1);
        ristorante.printAllTables();

    }
}
