package menu;

public enum EnumTipoPortata {
    VEGETARIANO ("Solo per vegetariani"),
    BAMBINO("Piatto adatto per i bambini"),
    CLASSICO("Piatto tipico della casa"),
    BAMBINO_CLASSICO("Piatto tipico adatto anche ai bambini"),
    BEVANDA("E' una bevanda");

    private String description;
    EnumTipoPortata(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
