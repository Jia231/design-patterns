package strategy.duck;

public class DabblingDuck extends Duck implements Flyable{
    @Override
    public String display() {
        return "im a Dabbling Duck and my friends call me Dabbler";
    }

    @Override
    public String fly() {
        return "Look man im flying!!!!";
    }
}
