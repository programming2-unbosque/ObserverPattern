package co.edu.unbosque.observerpattern.publisher;

import co.edu.unbosque.observerpattern.subscriber.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>(); // Stores the current list of subscribers
    private int state; // Represents the message to be passed to subscribers, can be more complex structures

    public int getState() {
        return state;
    }

    // When a new state is setted, all subscribers are notified
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    // Method used by subscribers when they want to subscribe to receive new states
    public void attach(Observer observer){
        observers.add(observer);
    }

    // Notification occurs for all subscribers currently attached
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}