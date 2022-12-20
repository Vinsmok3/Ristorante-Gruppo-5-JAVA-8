package menu;

public enum TypesEnum {
    VEGETARIANO ("Solo per vegetariani"),
    CARNIVORO ("Solo per vegetariani"),
    VEGANO ("Solo per vegetariani");


    private String description;
    TypesEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
