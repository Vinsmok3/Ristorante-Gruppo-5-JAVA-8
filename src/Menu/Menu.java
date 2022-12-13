package Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<Portata> listaPortata = new ArrayList<>();
    private List<EnumTipoMenu> type;

    public void addPortata(Portata portata) {
        listaPortata.add(portata);
    }

    public void removePortata(Portata portata) {
        listaPortata.remove(portata);
    }

    public List<EnumTipoMenu> getType() {
        return type;
    }

    public void setType(List<EnumTipoMenu> type) {
        this.type = type;
    }

    public void printAllMenu() {
        for (Portata portata : listaPortata) {
            portata.printPortataDetail();
        }
    }
}

