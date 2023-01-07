package tableRestaurant;

import client.Cliente;
import menu.EnumTipoMenu;
import menu.EnumTipoRistorante;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Ristorante{

    //TODO rivedere un po l'organizzazione del cleaning code, non deve estendere menu ma deve avere un oggetto menù test gg
    private final List<Cliente> clientList = new ArrayList<>();
    private final List<Tavoli> tavoliList = new ArrayList<>();
    private String nomeRistorante;

    //TODO qui ci deve essere un menù che verrà aggiunto al ristorante

    //TODO possiamo fare anche un enum per il ristorante che indica il  e poi
    //utilizzare anche l'enumeraro

    Menu menuPesce = new Menu(EnumTipoMenu.PESCE, "4 Uomini e un Pesce");
    public Ristorante(String nomeRistorante, EnumTipoRistorante tipoRistorante) {
        this.nomeRistorante = nomeRistorante;
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
     public void infoMenu(){
         System.out.println("NOME MENU: " + menuPesce.getNomeMenu());
         System.out.println("TIPO MENU: " + menuPesce.getTipoMenu());
     }
    public void printAllTables() {
        for (Tavoli listaTavoli : tavoliList) {
            listaTavoli.printAllTables();
        }

    }
}

