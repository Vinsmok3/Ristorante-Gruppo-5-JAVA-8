import Client.Cliente;
import Menu.*;
import TableRestaurant.Ristorante;
import TableRestaurant.Tavoli;

public class Start {
    public static void main(String[] args) {
        Menu menuClassico = new Menu();
        Menu menuBambino = new Menu();
        Menu menuVegetariano = new Menu();

        Ristorante ristorante = new Ristorante("Ammutta Muddica", "Pesce", "4 Uomini e un pesce");

        //BEVANDE
        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, 9, EnumTipoMenu.ALCOLICO);
        Portata bevanda2 = new Bevande("BEVANDA: ", "Acqua", 10, EnumTipoMenu.ANALCOLICO);
        //PRIMI
        Portata primo1 = new PrimiPiatti("PRIMI: ", "Pasta con le cozze", 23, true, EnumTipoMenu.CLASSICO);
        Portata primo2 = new PrimiPiatti("PRIMI: ", "Pasta con le vongole", 25, true, EnumTipoMenu.CLASSICO);
        Portata primo3 = new PrimiPiatti("PRIMI: ", "Farfalle con il salmone", 18, false, EnumTipoMenu.BAMBINO);
        Portata primo4 = new PrimiPiatti("PRIMI: ", "Insalata di mare", 22, true, EnumTipoMenu.VEGETARIANO);
        //SECONDI
        Portata secondi1 = new SecondiPiatti("SECONDI: ", "Pesce Spada", 25, true, EnumTipoMenu.CLASSICO);
        Portata secondi2 = new SecondiPiatti("SECONDI: ", "Frittura di calamari e gamberi", 10, false, EnumTipoMenu.CLASSICO);
        Portata secondi3 = new SecondiPiatti("SECONDI: ", "Bastoncini Findus", 5, false, EnumTipoMenu.BAMBINO);
        Portata secondi4 = new SecondiPiatti("SECONDI: ", "Alghe fritte", 22, true, EnumTipoMenu.VEGETARIANO);
        //DOLCI
        Portata dolce1 = new Dolci("DOLCE: ", "Parfait di mandorle", 10, true, EnumTipoMenu.VEGETARIANO);
        Portata dolce2 = new Dolci("DOLCE: ", "Tiramisù", 22, false, EnumTipoMenu.CLASSICO);
        Portata dolce3 = new Dolci("DOLCE: ", "Gelato Artigianale", 5, true, EnumTipoMenu.BAMBINO);

        Cliente cliente1 = new Cliente("Paul", "Cannon", "+ 39 3960382722");

        Tavoli tavoli1 = new Tavoli(1, 2, true);

        //MENU-CLASSICO
        menuClassico.addPortata(primo1);
        menuClassico.addPortata(primo2);
        menuClassico.addPortata(secondi1);
        menuClassico.addPortata(secondi2);
        menuClassico.addPortata(dolce2);
        menuClassico.addPortata(bevanda1);
        menuClassico.addPortata(bevanda2);
        //MENU-VEGETERIANO
        menuVegetariano.addPortata(primo4);
        menuVegetariano.addPortata(secondi4);
        menuVegetariano.addPortata(dolce1);
        menuVegetariano.addPortata(bevanda1);
        menuVegetariano.addPortata(bevanda2);
        //MENU-BAMBINO
        menuBambino.addPortata(primo3);
        menuBambino.addPortata(secondi3);
        menuBambino.addPortata(dolce3);
        menuBambino.addPortata(bevanda2);

        ristorante.infoRistorante();
        System.out.println("----------CLASSICO----------");
        menuClassico.printAllMenu();
        System.out.println("----------BAMBINO----------");
        menuBambino.printAllMenu();
        System.out.println("----------VEGETERIANO----------");
        menuVegetariano.printAllMenu();
        //ristorante.printAllMenu();
        System.out.println("----------LISTA CLIENTI----------");
        ristorante.addClient(cliente1);
        ristorante.printAllClients();
        System.out.println("----------LISTA TAVOLI-----------");
        ristorante.addTavoli(tavoli1);
        ristorante.printAllTables();

    }
}
