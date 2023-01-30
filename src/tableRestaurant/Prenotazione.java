package tableRestaurant;

import client.Cliente;

public class Prenotazione {
    private int time;
    private Cliente surname;
    private Tavoli idTavolo;

    public Prenotazione(int time, Cliente surname, Cliente phoneNumber, Tavoli idTavolo) {
        this.time = time;
        this.surname = surname;
        this.idTavolo = idTavolo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Cliente getSurname() {
        return surname;
    }

    public void setSurname(Cliente surname) {
        this.surname = surname;
    }


    public Tavoli getIdTavolo() {
        return idTavolo;
    }

    public void setIdTavolo(Tavoli idTavolo) {
        this.idTavolo = idTavolo;
    }
}
