package menu;

public enum TipoEnum {
    PESCE ("Menu di pesce"),
    BAMBINO ("Menu per bambini"),
    VEGETARIANO ("Menu per vegetariani");

    private final String description;
    TipoEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
