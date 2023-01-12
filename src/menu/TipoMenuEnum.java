package menu;

public enum TipoMenuEnum {
    PESCE ("Menu di pesce"),
    BAMBINO ("Menu per bambini"),
    VEGETARIANO ("Menu per vegetariani");

    private final String description;
    TipoMenuEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
