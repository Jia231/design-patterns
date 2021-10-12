package strategy.duck;

public class WillFly implements FlyBehavior {
    @Override
    public String fly() {
        return "Look im flying!!!";
    }
}
