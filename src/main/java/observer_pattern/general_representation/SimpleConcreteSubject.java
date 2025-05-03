package observer_pattern.general_representation;

import java.util.ArrayList;
import java.util.List;

public class SimpleConcreteSubject implements Subject {
    private List<Observer> observerList;
    private int value;

    public SimpleConcreteSubject(){
        observerList = new ArrayList<>();
        value = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer != null)
            observerList.add(observer);
        else
            System.out.println("Observer is null");
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    // get state method
    public int getValue() {
        return value;
    }

    // set state method
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
