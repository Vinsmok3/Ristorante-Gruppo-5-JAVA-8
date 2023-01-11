package tableRestaurant;

import client.Cliente;
import menu.EnumTipoRistorante;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    //TODO rivedere un po l'organizzazione del cleaning code, non deve estendere menu ma deve avere un oggetto menù test gg
    private List<Cliente> clientList = new ArrayList<>();
    private List<Tavoli> tavoliList = new ArrayList<>();



    private String nomeRistorante;

    //TODO qui ci deve essere un menù che verrà aggiunto al ristorante

    //TODO possiamo fare anche un enum per il ristorante che indica il  e poi
    //utilizzare anche l'enumeraro

    //TODO cambiare i getter e i setter
    //private Menu menu;

    //TODO capienza ristorante inserire campo, e quindi nel metodo prenota (passeremo un cliente e un tavolo)
    //dovremmo aggiungere un tavolo alla lista tavoliList che creiamo qui solo se
    // la size è ancora minore di capienza totale

    //quindi useremo una lista di tavoli e una lista di clienti, su ogni prenotazione
    // noi aggiugiamo il tavolo alla sua lista e il cliente alla sua lista
    //quando chiediamo il conto eliminiamo il tavolo dalla lista e il cliente dalla lista

        public void bookTable(int tableNumber, Cliente customer) {
            for (Tavoli table : tavoliList) {
                if (table.getTableNumber() == tableNumber && table.isAvailable()) {
                    table.setAvailable(false);
                    table.setCliente(customer);
                    clientList.add(customer);
                    System.out.println("Table " + tableNumber + " has been successfully booked for " + customer.getName());
                    return;
                }
            }
            System.out.println("Table " + tableNumber + " is not available.");
        }

    public Ristorante(String nomeRistorante, EnumTipoRistorante tipoRistorante) {
        this.nomeRistorante = nomeRistorante;
    }
    public List<Cliente> getClientList() {
        return clientList;
    }

    public void setClientList(List<Cliente> clientList) {
        this.clientList = clientList;
    }

    public List<Tavoli> getTavoliList() {
        return tavoliList;
    }

    public void setTavoliList(List<Tavoli> tavoliList) {
        this.tavoliList = tavoliList;
    }
    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }


    public void addClient(Cliente cliente) {
        clientList.add(cliente);
    }

    public void removeClient(Cliente cliente) {
        clientList.remove(cliente);
    }

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
        System.out.println("RISTORANTE: " + getNomeRistorante() + "\n" + "SPECIALITÀ: " + EnumTipoRistorante.PESCE);
    }
     /*public void infoMenu(){
         System.out.println("NOME MENU: " + menu.getNomeMenu());
         System.out.println("TIPO MENU: " + menu.getTipoMenu());
     }*/
    public void printAllTables() {
        for (Tavoli listaTavoli : tavoliList) {
            System.out.println(listaTavoli.toString());
        }

    }
}

