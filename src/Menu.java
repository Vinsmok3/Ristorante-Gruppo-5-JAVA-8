import java.util.ArrayList;
import java.util.List;

public class Menu{


    private String nomeRistorante;
    private String tipoMenu;
    private String nomeMenu;

    //TODO non c'è bisogno di fare una lista per ogni tipo basta una lista di portate e basta!
    private List<Portata> listaPortata = new ArrayList<>();


    public Menu(String nomeRistorante, String tipoMenu, String nomeMenu) {
        this.nomeRistorante = nomeRistorante;
        this.tipoMenu = tipoMenu;
        this.nomeMenu = nomeMenu;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }


    //TODO fare solo un metodo addPortata
    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }
    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }


    public void printAllMenu() {
        System.out.println("RISTORANTE:" + "\s" + nomeRistorante + "\n" + "MENU' DI: " + "\s" + tipoMenu + "\n" + "NOME DEL MENU': " + "\s" + nomeMenu);
        System.out.println(listaPortata.toString().replace("[", "").replace("]", "").replace(", ", ""));
        //System.out.println(listaPortata);
        System.out.println(listaPortata);

    }
}


