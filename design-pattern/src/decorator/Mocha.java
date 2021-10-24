package decorator;

public class Mocha extends Decorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Integer cost() {
        return this.beverage.cost() + 100 ;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " Mocha ";
    }
}
