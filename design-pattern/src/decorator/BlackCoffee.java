package decorator;

import java.util.Arrays;

public class BlackCoffee extends Beverage{

    public BlackCoffee(String size) {
        this.description = "Black Coffee";
        this.size = Arrays.stream(DrinkSizes.values())
                .filter(ds -> ds.label.equals(size))
                .findFirst().orElse(DrinkSizes.Small);
    }

    @Override
    public Integer cost() {
        return 500;
    }
}
