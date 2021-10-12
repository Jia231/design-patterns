package strategy.duck;

public class DivingDuck extends Duck {

    public DivingDuck() {
        flyBehavior = new WillFly();
    }

    @Override
    String display() {
        return "Im a Diving Duck";
    }

}
