package client;

import menu.TipoEnum;

public class Cliente{

    //TODO metodi di info su Cliente, una città o una email per fare la conferma prenotazione, ecc ecc

    private String name;
    private String surname;
    private String phoneNumber;
    private final TipoEnum tipoCliente;

    public Cliente(String name, String surname, String phoneNumber, TipoEnum tipoCliente) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.tipoCliente = tipoCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void printAllClients() {
        System.out.println("Nome: " + getName() + " - " + "Cognome: " + getSurname() + " - " + "Numero di telefono: " + getPhoneNumber());
    }
}
