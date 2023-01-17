package menu;

public enum TipoDrinkEnum {

    //TODO inserire anche la graduazione alcolica
    ALCOLICO_LEGGERO("Bevanda alcolica leggera"),
    ALCOLICO_MEDIO("Bevanda alcolica media"),
    ALCOLICO_FORTE("Bevanda alcolica forte"),
    ANALCOLICO("Bevanda analcolica");

    private final String description;
    TipoDrinkEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
