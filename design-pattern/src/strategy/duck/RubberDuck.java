package strategy.duck;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyBehavior = new NoFly();
    }

    @Override
    public String display() {
        return "im a Rubber Duck";
    }
}
