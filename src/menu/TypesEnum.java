package menu;

public enum TypesEnum {
    VEGETARIANO ("Solo per vegetariani"),
    CARNIVORO ("Solo per carnivori"),
    VEGANO ("Solo per vegani"),
    BEVANDA ( "Bevanda");

    private final String description;
    TypesEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
