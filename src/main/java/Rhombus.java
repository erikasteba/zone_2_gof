import java.util.ArrayList;
import java.util.List;

//Observer
class Rhombus extends Shape {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    void showShape() {
        System.out.println("A rhombus");
        notifyObservers();
    }
}