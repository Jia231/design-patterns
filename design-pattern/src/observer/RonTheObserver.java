package observer;

public class RonTheObserver implements Observer{

    private String name;

    @Override
    public void update(String newName) {
        this.name = newName;
    }

    @Override
    public void display() {
        System.out.println("Im Ron the observer and ohhh this is the new name " + this.name);
    }


}
