package strategy.duck;

public abstract class Duck {
    public FlyBehavior flyBehavior;

    public void quack() {
        System.out.println("QUACK QUACK QUACK!!!!");
    }
    abstract String display();
    public void swim() {
        System.out.println("Look im swimming!!!!");
    };

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public String fly() {
        return flyBehavior.fly();
    }
    //Not all ducks should fly, we shouldn't add this here
    /*@Deprecated
    public String fly() {
        return "Look man im flying!!!!";
    }*/
}
