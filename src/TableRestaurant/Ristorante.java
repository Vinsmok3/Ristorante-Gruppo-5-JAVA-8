package TableRestaurant;

import Client.Cliente;
import Menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante extends Menu{




    //TODO rivedere un po l'organizzazione del cleaning code, non deve estendere menu ma deve avere un oggetto menù test
    private List<Cliente> clientList = new ArrayList<>();
    private List<Tavoli> tavoliList = new ArrayList<>();

    private String nomeRistorante;
    private String tipoMenu;
    private String nomeMenu;

    public Ristorante(String nomeRistorante, String tipoMenu, String nomeMenu) {
        this.nomeRistorante = nomeRistorante;
        this.tipoMenu = tipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
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

    /**
     *
     */
    @Override
    public void printAllMenu() { //Non printa.
        super.printAllMenu();
    }

    public void infoRistorante(){
        System.out.println("RISTORANTE: " + getNomeRistorante() + " - " + "TIPO MENU: " + getTipoMenu() + " - " + "NOME MENU: " + getNomeMenu());
    }

    public void printAllTables() {
        for (Tavoli listaTavoli : tavoliList) {
            listaTavoli.printAllTables();
        }

    }
}

