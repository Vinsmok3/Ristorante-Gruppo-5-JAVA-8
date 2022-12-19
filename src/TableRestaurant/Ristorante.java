package TableRestaurant;

import Client.Cliente;
import Menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    //TODO rivedere un po l'organizzazione del cleaning code, non deve estendere menu ma deve avere un oggetto menù test gg
    private List<Cliente> clientList = new ArrayList<>();
    private List<Tavoli> tavoliList = new ArrayList<>();

    private String nomeRistorante;

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

