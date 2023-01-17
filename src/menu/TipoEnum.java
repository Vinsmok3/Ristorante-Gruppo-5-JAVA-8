package menu;

public enum TipoEnum {
    VEGETARIANO ("Solo per vegetariani"),
    CARNIVORO ("Solo per carnivori"),

    VEGANO ("Solo per vegani");

    private final String description;
    TipoEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
