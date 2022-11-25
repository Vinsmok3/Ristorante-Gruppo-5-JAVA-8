import java.util.ArrayList;
import java.util.List;

public class ListaClientieTavoli {


    private List<Tavoli> tavoliList = new ArrayList<>();

    private List<Cliente> clientList = new ArrayList<>();

    public void addClient(Cliente cliente){
        clientList.add(cliente);
    }
    public void removeClient(Cliente cliente){
        clientList.remove(cliente);
    }

    public void printAllClients(){
        System.out.println(clientList.toString().replace("[", "").replace("]", "").replace(", ",""));
    }


    public void addTavoli(Tavoli tavoli){
        tavoliList.add(tavoli);
    }
    public void removeTavoli(Tavoli tavoli){
        tavoliList.remove(tavoli);
    }

    public void printAllTavoli(){
        System.out.println(tavoliList.toString().replace("[", "").replace("]", "").replace(", ",""));
    }





}
