package decorator;

public class Whip extends Decorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return beverage.cost() + getCostDependingOnSize();
    }

    private Integer getCostDependingOnSize() {
        if(beverage.getSize().equals(DrinkSizes.Small.label)) {
            return 100;
        }
        else if(beverage.getSize().equals(DrinkSizes.Tall.label)) {
            return 150;
        }
        else {
            return 180;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getSize()+" Whip "+beverage.getDescription() ;
    }
}
