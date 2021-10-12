package strategy.duck;

public interface Flyable {
    String fly();
}

//This is not maintainable because we will need to add code into every composition.duck that will be able to fly
