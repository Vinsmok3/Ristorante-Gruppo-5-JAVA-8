public class Cliente extends ListaClienti {

    private final boolean hasBooked;


    public Cliente(String name, String surname, int phoneNumber, boolean hasBooked) {
        super(name, surname, phoneNumber);
        this.hasBooked = hasBooked;
    }


    public String hasBooked() {
        if (hasBooked) {
            return "Il cliente ha prenotato";
        } else
            return "Il cliente non ha prenotato";
    }


    @Override
    public void printAllClients() {
        System.out.println("Nome: " + getName() + " - " + "Cognome: " + getSurname() + " - " + "Numero di telefono: " + getPhoneNumber() + " - " + hasBooked());
    }
}
