package org.example.observer_pattern;

public class SimpleConcreteObserver implements Observer {
    private int value;
    private SimpleConcreteSubject subject;

    public SimpleConcreteObserver(SimpleConcreteSubject subject){
        this.subject = subject;
        // register observer
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        this.value =  subject.getValue();
        display();
    }

    public void display(){
        System.out.println("Current value: "+value);
    }
}
