package tableRestaurant;

import client.Cliente;
import menu.Menu;
import java.util.ArrayList;
import java.util.List;

public class Ristorante {

    private List<Cliente> clientList = new ArrayList<>();
    private List<Tavoli> tavoliList = new ArrayList<>();

    private String nomeRistorante;
    private String tipoRistorante;



    private Menu menu;
    private int limitTables;

    public Ristorante(String nomeRistorante, String tipoRistorante) {
        this.nomeRistorante = nomeRistorante;
        this.tipoRistorante = tipoRistorante;
    }

    //TODO la capienza massima va passata al costruttore
    /*public void bookTable(int tableNumber, Cliente customer) {
        for (Tavoli table : tavoliList) {
            if (table.getTableNumber() == tableNumber && table.isAvailable() && limitTables <= 40) {
                table.setAvailable(false);
                table.setCliente(customer);
                clientList.add(customer);
                limitTables++;
                System.out.println("Il Tavolo " + tableNumber + " é stato prenotato correttamente da " + customer.getName());
                return;
            }
        }
        System.out.println("Il Tavolo " + tableNumber + " é già prenotato");
    }*/

    public void bookTable(Cliente customer) {
        for (Tavoli table : tavoliList) {
            if (table.isAvailable() && limitTables <= 40) {
                table.setAvailable(false);
                table.setCliente(customer);
                clientList.add(customer);
                limitTables++;
                System.out.println("Il Tavolo " + table.getTableNumber() + " é stato prenotato correttamente da " + customer.getName() + " - " + "Il Cliente ha confermato la prenotazione ? " + checkConfirmation(customer));
                return;
            }
        }
        System.out.println("Non ci sono tavoli disponibili.");
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

    public int getLimitTables() {
        return limitTables;
    }

    public void setLimitTables(int limitTables) {
        this.limitTables = limitTables;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public String getTipoRistorante() {
        return tipoRistorante;
    }

    public void setTipoRistorante(String tipoRistorante) {
        this.tipoRistorante = tipoRistorante;
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

    public void addReservation() {

    }

    public void printLimitTableInfo() {
        System.out.println("Tavoli Prenotati: " + limitTables + "\n" + "Limite Massimo Tavoli:40");
    }

    public void printAllClients() {
        for (Cliente cliente : clientList) {
            cliente.printAllClients();
        }
    }

    public void infoRistorante() {
        System.out.println("RISTORANTE: " + getNomeRistorante() + "\n" + "SPECIALITÀ: " + getTipoRistorante());
    }

    public void infoMenu() {
        System.out.println("NOME MENU: " + menu.getNomeMenu());
        System.out.println("TIPO MENU: " + menu.getTipoMenu());
    }

    public void printReservations() {
        for (Tavoli listaTavoli : tavoliList) {
            listaTavoli.printTableDetails();
        }

    }
    public boolean checkConfirmation(Cliente customer) {
        for (Tavoli table : tavoliList) {
            if (table.getCliente() != null && table.getCliente().equals(customer) && !table.isAvailable()) {
                return table.getCliente().getReservationConfirmed();
            }
        }
        return false;
    }
}

