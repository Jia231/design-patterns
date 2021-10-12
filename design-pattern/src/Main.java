import strategy.duck.FlyWithRocket;
import strategy.duck.RubberDuck;

public class Main {

    public static void main(String[] args) {
        //dabbling composition.duck
        /*DabblingDuck dduck = new DabblingDuck();
        dduck.display();*/


        //rubber composition.duck
        RubberDuck rduck = new RubberDuck();
        System.out.println(rduck.fly());
        System.out.println("------------");
        rduck.setFlyBehavior(new FlyWithRocket());
        System.out.println(rduck.fly());
        //rduck.display();
        /*System.out.println(String.format("%s And I shouldnt be flying!!!! Because %s",
                rduck.fly(), rduck.display()));*/

        /*DivingDuck diveDuck = new DivingDuck();
        System.out.println(diveDuck.fly());*/

    }
}
