package tableRestaurant;

import client.Cliente;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    //TODO rivedere un po l'organizzazione del cleaning code, non deve estendere menu ma deve avere un oggetto menù test gg
    private List<Cliente> clientList = new ArrayList<>();
    // USARE MAP PER I TAVOLI
    private List<Tavoli> tavoliList = new ArrayList<>();

    private String nomeRistorante;
// RISTORANTE NON DEVE AVERE TIPO MENU, MA TIPO RISTORANTE + NOME + TAVOLI + INFO RISTORANTE
    public Ristorante(String nomeRistorante, String tipoMenu, String nomeMenu) {
        this.nomeRistorante = nomeRistorante;
    }

    Menu menu = new Menu("PESCE", "4 Uomini e un Pesce");

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

// LISTA CLIENTI O DA SPOSTARE IN CLASSE CLIENTI O NON INDISPENSABILE PER RISTORANTE...
    // AGGIUNGERE AL MASSIMO MAP PER TAVOLI E SAPERE QUANTI TAVOLI CI SONO E QUALI SONO LIBERI O OCCUPATI O FUORI
    public void addClient(Cliente cliente) {
        clientList.add(cliente);
    }

    public void removeClient(Cliente cliente) {
        clientList.remove(cliente);
    }
// METODO NON NECESSARIO VISTO CHE UN RISTORANTE AVRA' UN TOT FISSO DI TAVOLI
    public void addTavoli(Tavoli tavoli) {
        tavoliList.add(tavoli);
    }

    public void removeTavoli(Tavoli tavoli) {
        tavoliList.remove(tavoli);
    }

    public void printAllClients() {
        for (Cliente cliente : clientList) {
            cliente.printAllClients();
        }
    }

    public void infoRistorante(){
        System.out.println("RISTORANTE: " + getNomeRistorante());
    }
     public void infoMenu(){
         System.out.println("TIPO MENU: " + menu.getTipoMenu());
         System.out.println("NOME MENU: " + menu.getNomeMenu());
     }
    public void printAllTables() {
        for (Tavoli listaTavoli : tavoliList) {
            listaTavoli.printAllTables();
        }

    }
}

