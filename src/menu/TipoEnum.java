package menu;

public enum TipoEnum {
    VEGETARIANO ("VEGETARIANO"),
    CARNIVORO ("CARNIVORO"),

    VEGANO ("VEGANO"),
    BEVANDA ("BEVANDA");

    private final String description;
    TipoEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
