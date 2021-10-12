package strategy.duck;

public class NoFly implements FlyBehavior{
    @Override
    public String fly() {
        return "I dont fly";
    }
}
