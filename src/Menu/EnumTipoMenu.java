package Menu;

public enum EnumTipoMenu {
    VEGETARIANO ("dolce solo per vegetariani"),
    BAMBINO,
    CLASSICO,
    BAMBINO_CLASSICO,
    ;

    private String descripition;
    EnumTipoMenu(String descripition) {
        this.descripition = descripition;
    }

    public String getDescripition() {
        return descripition;
    }
}
