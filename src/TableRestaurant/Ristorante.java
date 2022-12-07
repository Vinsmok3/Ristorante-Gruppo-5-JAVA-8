package TableRestaurant;

import Client.Cliente;
import Menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante extends Menu {
    private final List<Cliente> clientList = new ArrayList<>();
    private final List<Tavoli> tavoliList = new ArrayList<>();

    public Ristorante(String nomeRistorante, String tipoMenu, String nomeMenu) {
        super(nomeRistorante, tipoMenu, nomeMenu);
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

    @Override
    public void printAllMenu() {
        super.printAllMenu();
    }

    public void printAllTables() {
        for (ListaTavoli listaTavoli : tavoliList) {
            listaTavoli.printAllTables();
        }

    }
}

