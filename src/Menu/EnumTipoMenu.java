package Menu;

public enum EnumTipoMenu {
    VEGETARIANO ("Solo per vegetariani"),
    BAMBINO("Piatto adatto per i bambini"),
    CLASSICO("Piatto tipico della casa"),
    BAMBINO_CLASSICO("Piatto tipico adatto anche ai bambini"),
    ALCOLICO("Bevanda Alcolica"),
    ANALCOLICO("Bevanda Analcolica")
    ;

    private String description;
    EnumTipoMenu(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
