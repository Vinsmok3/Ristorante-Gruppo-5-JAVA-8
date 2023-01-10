package menu;

public enum EnumTipoRistorante {

    //TODO che li pagate voi gli enumerati? forse va via questo?
    PESCE ("Ristorante di Pesce");
    private final String description;
    EnumTipoRistorante(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
