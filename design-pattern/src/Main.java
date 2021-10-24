import decorator.Beverage;
import decorator.BlackCoffee;
import decorator.Mocha;
import decorator.Whip;
import observer.JaneTheObserver;
import observer.Observer;
import observer.RonTheObserver;
import observer.Subject;
import strategy.duck.FlyWithRocket;
import strategy.duck.RubberDuck;

public class Main {

    public static void main(String[] args) {
        //Todo: Observer pattern
        /*Subject subject = new Subject();
        Observer observerRon = new RonTheObserver();
        Observer observerJane = new JaneTheObserver();
        subject.addObserver(observerRon);
        subject.addObserver(observerJane);
        subject.update();
        subject.setName("Mayra");
        subject.update();
        subject.setName("Lommel");
        subject.removeObserver(observerJane);
        subject.update();*/

        //Todo: Decorator
        Beverage beverage = new BlackCoffee("Venti");
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription()+ " "+ beverage.cost());
    }

    void duckCode() {
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
