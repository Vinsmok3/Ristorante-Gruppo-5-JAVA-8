import java.util.ArrayList;
import java.util.List;

public class Menu{

    //TODO TUTTI SEMPRE PRIVATE
    public String nomeRistorante;
    public String tipoMenu;
    public String nomeMenu;
    private String completeMenu;

    private List<Portata> portateList = new ArrayList<>();
    public Menu(String nomeRistorante, String tipoMenu, String nomeMenu) {
        this.nomeRistorante = nomeRistorante;
        this.tipoMenu = tipoMenu;
        this.nomeMenu = nomeMenu;
        this.completeMenu =  nomeRistorante+ "\n" +"Tipo menu: "  + tipoMenu + "\n" + nomeMenu.toUpperCase();
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


    public void addPortata(Portata portata){
        portateList.add(portata);
    }
    public void removePortata(Portata portata){
        portateList.add(portata);
    }

    public void printAllMenu(){
        //stampare per bene il menu
    }
}
