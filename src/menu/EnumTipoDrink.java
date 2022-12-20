package menu;

public enum EnumTipoDrink {
    ALCOLICO_LEGGERO("Bevanda alcolica leggera"),
    ALCOLICO_MEDIO("Bevanda alcolica media"),
    ALCOLICO_FORTE("Bevanda alcolica forte"),
    ANALCOLICO("Bevanda analcolica");

    private String description;
    EnumTipoDrink(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
