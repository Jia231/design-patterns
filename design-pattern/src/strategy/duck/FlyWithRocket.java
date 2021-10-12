package strategy.duck;

public class FlyWithRocket implements FlyBehavior{

    @Override
    public String fly() {
        return "Im flying with a rocket";
    }
}
