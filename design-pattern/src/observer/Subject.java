package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Subject {
    private List<Observer> observers;
    private String name;

    public Subject () {
        this.name = "Chris";
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers = observers.stream()
                .filter(ob -> !ob.equals(observer))
                .collect(Collectors.toList());
    }

    private void addLine() {
        System.out.println("------------------------");
    }

    public void update() {
        observers.stream().forEach(ob -> {
            ob.update(this.name);
            addLine();
            ob.display();
        });
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}
