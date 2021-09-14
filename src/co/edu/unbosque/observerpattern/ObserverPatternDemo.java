package co.edu.unbosque.observerpattern;

import co.edu.unbosque.observerpattern.publisher.Subject;
import co.edu.unbosque.observerpattern.subscriber.BinaryObserver;
import co.edu.unbosque.observerpattern.subscriber.HexaObserver;
import co.edu.unbosque.observerpattern.subscriber.OctalObserver;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        // Creating the publisher/subject
        Subject subject = new Subject();

        // Creating the subscribers/observers and attaching them to the publisher
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // Publishing a first message
        System.out.println("First state change: 15");
        subject.setState(15);

        // Publishing a second message
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}