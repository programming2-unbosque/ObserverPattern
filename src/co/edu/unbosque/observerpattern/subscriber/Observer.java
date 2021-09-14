package co.edu.unbosque.observerpattern.subscriber;

import co.edu.unbosque.observerpattern.publisher.Subject;

public abstract class Observer {

    protected Subject subject; // References the publisher for attaching and getting state purposes

    // Method used by the publisher when they want to notify subscribers
    public abstract void update();

}
