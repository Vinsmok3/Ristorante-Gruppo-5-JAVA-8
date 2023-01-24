package client;

import menu.TipoEnum;
import tableRestaurant.Tavoli;

public class Cliente{

    //TODO metodi di info su Cliente, una città o una email per fare la conferma prenotazione, ecc ecc

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private Boolean isReservationConfirmed;
    private final TipoClienteEnum tipoCliente;

    public Cliente(String name, String surname, String phoneNumber, TipoClienteEnum tipoCliente, String email, Boolean isReservationConfirmed) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.tipoCliente = tipoCliente;
        this.email = email;
        this.isReservationConfirmed = isReservationConfirmed;
    }

    public Boolean getReservationConfirmed() {
        return isReservationConfirmed;
    }

    public void setReservationConfirmed(Boolean reservationConfirmed) {
        isReservationConfirmed = reservationConfirmed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        System.out.println("Nome: " + getName() + " - " + "Cognome: " + getSurname() + " - " + "Numero di telefono: " + getPhoneNumber() + " - " + tipoCliente.getDescription() + " - " + "Email: " + getEmail());
    }

}
