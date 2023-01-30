package client;

public enum TipoClienteEnum {
    VEGETARIANO ("VEGETARIANO"),
    CLASSICO("CLASSICO"),

    VEGANO ("VEGANO");

    private final String description;
    TipoClienteEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
