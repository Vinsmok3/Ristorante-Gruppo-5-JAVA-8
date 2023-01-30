import client.Cliente;
import client.TipoClienteEnum;
import menu.*;
import tableRestaurant.Ristorante;
import tableRestaurant.Tavoli;

public class Start {
    public static void main(String[] args) {
        Menu menuPesce = new Menu(TipoMenuEnum.PESCE,1);
        Menu menuBambino = new Menu(TipoMenuEnum.BAMBINO,2);
        Menu menuVegetariano = new Menu(TipoMenuEnum.VEGETARIANO,3);


        Ristorante ristorante = new Ristorante("Ammutta Muddica", "Pesce");

        //BEVANDE
        Portata bevanda1 = new Bevande("BEVANDA: ", "Vino", 20, true, TipoEnum.BEVANDA, TipoDrinkEnum.ALCOLICO_LEGGERO, 7.5);
        Portata bevanda2 = new Bevande("BEVANDA: ", "Acqua", 10, false, TipoEnum.BEVANDA, TipoDrinkEnum.ANALCOLICO, 0.0);
        //PRIMI
        Portata primo1 = new PrimiPiatti("PRIMI: ", "Pasta con le cozze", 23, true, TipoEnum.CARNIVORO);
        Portata primo2 = new PrimiPiatti("PRIMI: ", "Pasta con le vongole", 25, true, TipoEnum.CARNIVORO);
        Portata primo3 = new PrimiPiatti("PRIMI: ", "Farfalle con il salmone", 18, false, TipoEnum.CARNIVORO);
        Portata primo4 = new PrimiPiatti("PRIMI: ", "Insalata di mare", 22, true, TipoEnum.VEGETARIANO);
        //SECONDI
        Portata secondi1 = new SecondiPiatti("SECONDI: ", "Pesce Spada", 25, true, TipoEnum.CARNIVORO);
        Portata secondi2 = new SecondiPiatti("SECONDI: ", "Frittura di calamari e gamberi", 10, false, TipoEnum.CARNIVORO);
        Portata secondi3 = new SecondiPiatti("SECONDI: ", "Bastoncini Findus", 5, false, TipoEnum.CARNIVORO);
        Portata secondi4 = new SecondiPiatti("SECONDI: ", "Alghe fritte", 22, true, TipoEnum.VEGETARIANO);
        //DOLCI
        Portata dolce1 = new Dolci("DOLCE: ", "Parfait di mandorle", 10, TipoEnum.VEGETARIANO, true);
        Portata dolce2 = new Dolci("DOLCE: ", "Tiramisù", 22, TipoEnum.CARNIVORO, false);
        Portata dolce3 = new Dolci("DOLCE: ", "Gelato Artigianale", 5, TipoEnum.CARNIVORO, true);

        Cliente cliente1 = new Cliente("Paul", "Cannon", "+ 39 3960382722", TipoClienteEnum.CLASSICO, "paulcannon22@gmail.com", true);
        Cliente cliente2 = new Cliente("Teresa", "Top", "+ 39 3954383342", TipoClienteEnum.VEGANO, "teresatop33@gmail.com", false);

        Tavoli tavoli1 = new Tavoli(1, true);
        Tavoli tavoli2 = new Tavoli(2, true);



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
        ristorante.addClient(cliente2);
        ristorante.printAllClients();
        System.out.println("----------PRENOTAZIONI----------");
        ristorante.addTavoli(tavoli1);
        ristorante.addTavoli(tavoli2);

        ristorante.bookTable(cliente1);
        ristorante.bookTable(cliente2);
        ristorante.printLimitTableInfo();
        ristorante.printReservations();
        //System.out.println(ristorante.checkConfirmation(cliente1));
        //System.out.println(ristorante.checkConfirmation(cliente2));
    }
}
