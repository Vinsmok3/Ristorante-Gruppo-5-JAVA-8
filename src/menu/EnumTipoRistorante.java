package menu;

public enum EnumTipoRistorante {
    PESCE ("Ristorante di Pesce");
    private final String description;
    EnumTipoRistorante(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
