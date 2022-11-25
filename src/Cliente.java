
public class Cliente extends ListaClientieTavoli {

    private String name;
    private String surname;
    private int phoneNumber;
    private  boolean hasBooked;

    public Cliente(String name, String surname, int phoneNumber, boolean hasBooked) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.hasBooked = hasBooked;
    }

    public String hasBooked(){
        if(hasBooked){
            return "il cliente ha prenotato";
        }else
            return "non ha prenotato";
    }

    @Override
    public String toString() {
        return
                "NOME: " + name + "\s" + " - " +
                "COGNOME: " + surname + "\s" + " - " +
                "NUMERO DI TELEFONO: " + phoneNumber + "\s" + " - " +
                "HA PRENOTATO?: " + hasBooked();
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

}
