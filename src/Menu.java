import java.util.ArrayList;
import java.util.List;

public class Menu{


    private String nomeRistorante;
    private String tipoMenu;
    private String nomeMenu;

    //TODO non c'è bisogno di fare una lista per ogni tipo basta una lista di portate e basta!
    private List<Portata> primiList = new ArrayList<>();


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
    public void addPrimi(Portata portata){
        primiList.add(portata);
    }
    public void removePrimi(Portata portata){primiList.remove(portata);
    }

    public void addBevanda(Portata portata){
        drinksList.add(portata);
    }
    public void removeBevanda(Portata portata){
        drinksList.add(portata);
    }

    public void addSecondi(Portata portata){
        secondiList.add(portata);
    }
    public void removeSecondi(Portata portata){
        secondiList.add(portata);
    }

    public void addDolci(Portata portata){
        dolciList.add(portata);
    }
    public void removeDolci(Portata portata){
        dolciList.add(portata);
    }


    public void printAllMenu(){
        System.out.println("RISTORANTE:" + "\s" + nomeRistorante + "\n" + "MENU' DI: " + "\s" +tipoMenu + "\n" + "NOME DEL MENU': " + "\s" +nomeMenu);
        System.out.println("------PRIMI PIATTI");
        System.out.println(primiList.toString().replace("[", "").replace("]", "").replace(", ",""));
        System.out.println("------SECONDI PIATTI");
        System.out.println(secondiList.toString().replace("[", "").replace("]", "").replace(", ",""));
        System.out.println("------BEVANDE");
        System.out.println(drinksList.toString().replace("[", "").replace("]", "").replace(", ",""));
        System.out.println("------DOLCI");
        System.out.println(dolciList.toString().replace("[", "").replace("]", "").replace(", ",""));


    }
}
