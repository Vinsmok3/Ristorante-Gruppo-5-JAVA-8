package menu;

public enum TipoPortataEnum {
    VEGETARIANO ("Solo per vegetariani"),
    CARNIVORO ("Solo per carnivori"),
    VEGANO ("Solo per vegani"),
    BEVANDA ( "Bevanda");

    private final String description;
    TipoPortataEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
