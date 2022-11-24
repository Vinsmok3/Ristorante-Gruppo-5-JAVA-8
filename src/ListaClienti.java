import java.util.ArrayList;
import java.util.List;

public class ListaClienti  {




    private List<Cliente> clientList = new ArrayList<>();

    public void addClient(Cliente cliente){
        clientList.add(cliente);
    }
    public void removeClient(Cliente cliente){
        clientList.remove(cliente);
    }

    public void printAllClients(){
        System.out.println(clientList.toString());
    }



}
