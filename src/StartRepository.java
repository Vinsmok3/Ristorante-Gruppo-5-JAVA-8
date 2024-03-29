import client.Cliente;
import client.ClienteRepository;
import client.TipoClienteEnum;
import menu.*;
import tableRestaurant.*;

import java.sql.SQLException;

public class StartRepository {
    public static void main(String[] args) throws SQLException {

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

        Ristorante ristorante = new Ristorante("Ammutta Mudica","Pesce");
        PortataRepository portata = new PortataRepository();
        MenuRepository menuRepository = new MenuRepository();
        Menu menuClassico = new Menu(TipoMenuEnum.CLASSICO, 1);
        ClienteRepository clienteRepository = new ClienteRepository();
        Prenotazione prenotazione1 = new Prenotazione(19);
        PrenotazioneRepository prenotazioneRepository = new PrenotazioneRepository();
        TavoliRepository tavolo  = new TavoliRepository();

        ristorante.createDB();
        menuRepository.createMenu();
        menuRepository.insertMenu(menuClassico);

        portata.createMenuPortata();
        portata.insertMenuPortata(bevanda2);

        menuRepository.createMenuPortata();

        tavolo.createTavolo();
        tavolo.insertTavolo(tavoli1);

        clienteRepository.createCliente();
        clienteRepository.insertCliente(cliente1,menuClassico);

        prenotazioneRepository.createPrenotazione();
        prenotazioneRepository.insertPrenotazione(prenotazione1,cliente1,tavoli1);
    }
}
