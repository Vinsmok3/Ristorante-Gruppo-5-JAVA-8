package tableRestaurant;

import client.Cliente;

public class Tavoli{
    
    private int tableNumber;
    private boolean available;
    private Cliente cliente;

    public Tavoli(int tableNumber,boolean available, Cliente cliente) {
        this.tableNumber = tableNumber;
        this.available = available;
        this.cliente = cliente;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean isAvailable() {
        return available;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void printTableDetails(){
        if (available){
        System.out.println("Numero Tavolo: " + getTableNumber() + "Cliente: " + getCliente().getName() + " " + "Libero");
    } else {
            System.out.println("Numero Tavolo: " + getTableNumber() +" - " + "Cliente: " + getCliente().getName() + " - " + "Prenotato");
        }
        }
}
