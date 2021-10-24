package observer;

public class JossTheObserver implements Observer {
    private String name;

    @Override
    public void update(String newName) {
        this.name = newName;
    }

    @Override
    public void display() {
        System.out.println("Im Joss the observer and ohhh this is the new name " + this.name);
    }

}
