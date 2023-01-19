package client;

public enum TipoClienteEnum {
    VEGETARIANO ("VEGETARIANO"),
    CARNIVORO ("CARNIVORO"),

    VEGANO ("VEGANO");

    private final String description;
    TipoClienteEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
