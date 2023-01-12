import client.Cliente;
import menu.*;
import tableRestaurant.Ristorante;
import tableRestaurant.Tavoli;

public class Start {
    public static void main(String[] args) {
        Menu menuPesce = new Menu(TipoMenuEnum.PESCE,"CLASSIC");
        Menu menuBambino = new Menu(TipoMenuEnum.BAMBINO,"CHILD");
        Menu menuVegetariano = new Menu(TipoMenuEnum.VEGETARIANO,"VEGGY");


        Ristorante ristorante = new Ristorante("Ammutta Muddica", "Pesce");

        //BEVANDE
        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, true, TipoPortataEnum.BEVANDA, TipoDrinkEnum.ALCOLICO_LEGGERO, 7.5);
        Portata bevanda2 = new Bevande("BEVANDA: ", "Acqua", 10, false, TipoPortataEnum.BEVANDA, TipoDrinkEnum.ANALCOLICO, 0.0);
        //PRIMI
        Portata primo1 = new PrimiPiatti("PRIMI: ", "Pasta con le cozze", 23, true, TipoPortataEnum.CARNIVORO);
        Portata primo2 = new PrimiPiatti("PRIMI: ", "Pasta con le vongole", 25, true, TipoPortataEnum.CARNIVORO);
        Portata primo3 = new PrimiPiatti("PRIMI: ", "Farfalle con il salmone", 18, false, TipoPortataEnum.CARNIVORO);
        Portata primo4 = new PrimiPiatti("PRIMI: ", "Insalata di mare", 22, true, TipoPortataEnum.VEGETARIANO);
        //SECONDI
        Portata secondi1 = new SecondiPiatti("SECONDI: ", "Pesce Spada", 25, true, TipoPortataEnum.CARNIVORO);
        Portata secondi2 = new SecondiPiatti("SECONDI: ", "Frittura di calamari e gamberi", 10, false, TipoPortataEnum.CARNIVORO);
        Portata secondi3 = new SecondiPiatti("SECONDI: ", "Bastoncini Findus", 5, false, TipoPortataEnum.CARNIVORO);
        Portata secondi4 = new SecondiPiatti("SECONDI: ", "Alghe fritte", 22, true, TipoPortataEnum.VEGETARIANO);
        //DOLCI
        Portata dolce1 = new Dolci("DOLCE: ", "Parfait di mandorle", 10, TipoPortataEnum.VEGETARIANO, true);
        Portata dolce2 = new Dolci("DOLCE: ", "Tiramisù", 22, TipoPortataEnum.CARNIVORO, false);
        Portata dolce3 = new Dolci("DOLCE: ", "Gelato Artigianale", 5, TipoPortataEnum.CARNIVORO, true);

        Cliente cliente1 = new Cliente("Paul", "Cannon", "+ 39 3960382722", TipoPortataEnum.CARNIVORO);

        Tavoli tavoli1 = new Tavoli(1, true);


        //MENU-CLASSICO
        menuPesce.addPortata(primo1);
        menuPesce.addPortata(primo2);
        menuPesce.addPortata(secondi1);
        menuPesce.addPortata(secondi2);
        menuPesce.addPortata(dolce2);
        menuPesce.addPortata(bevanda1);
        menuPesce.addPortata(bevanda2);
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
        // Bisogna creare print menu differenti in base al cliente e magari collegare tutte le liste di portata ad un grande menu creato con hashmap
        //ristorante.infoMenu();

        System.out.println("----------CLASSICO----------");
        menuPesce.printAllMenu();
        System.out.println("----------BAMBINO----------");
        menuBambino.printAllMenu();
        System.out.println("----------VEGETERIANO----------");
        menuVegetariano.printAllMenu();
        System.out.println("----------LISTA CLIENTI----------");
        ristorante.addClient(cliente1);
        ristorante.printAllClients();
        System.out.println("----------PRENOTAZIONI----------");
        ristorante.addTavoli(tavoli1);
        ristorante.bookTable(1,cliente1);
        ristorante.printLimitTableInfo();
        ristorante.printReservations();
    }
}
