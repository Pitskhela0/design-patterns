package org.example.observer_pattern.general_representation;

import org.example.observer_pattern.general_representation.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
