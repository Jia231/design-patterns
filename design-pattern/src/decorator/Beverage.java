package decorator;

public abstract class Beverage {
    String description;
    DrinkSizes size;

    public String getDescription() {
        return description;
    }

    public abstract Integer cost();

    public String getSize() {
        return size.label;
    }
}
