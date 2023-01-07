package menu;

public enum EnumTipoMenu {
    PESCE ("Menu di pesce"),
    BAMBINO ("Menu per bambini"),
    VEGETARIANO ("Menu per vegetariani");

    private final String description;
    EnumTipoMenu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
