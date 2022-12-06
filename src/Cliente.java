public class Cliente{

    private String name;
    private String surname;
    private int phoneNumber;
    public Cliente(String name, String surname, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void printAllClients() {
        System.out.println("Nome: " + getName() + " - " + "Cognome: " + getSurname() + " - " + "Numero di telefono: " + getPhoneNumber() + " - " + hasBooked());
    }
}
