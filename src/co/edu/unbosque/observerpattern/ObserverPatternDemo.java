package co.edu.unbosque.observerpattern;

import co.edu.unbosque.observerpattern.publisher.Subject;
import co.edu.unbosque.observerpattern.subscriber.BinaryObserver;
import co.edu.unbosque.observerpattern.subscriber.HexaObserver;
import co.edu.unbosque.observerpattern.subscriber.OctalObserver;

import java.util.Scanner;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        // Creating the publisher/subject
        Subject subject = new Subject();

        // Creating the subscribers/observers and attaching them to the publisher
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // Reading from user input
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number to be transformed:");
            Integer number = scan.nextInt();
            subject.setState(number);
            System.out.println();
        }
    }
}