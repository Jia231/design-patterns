package decorator;

public enum DrinkSizes {
    Tall("Tall"),
    Venti("Venti"),
    Small("Small");

    public final String label;

    DrinkSizes(String label) {
        this.label = label;
    }

    public String labelOf(DrinkSizes drinkSize) {
        return drinkSize.label;
    }
}
