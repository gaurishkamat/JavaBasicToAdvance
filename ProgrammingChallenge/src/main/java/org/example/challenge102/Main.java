package org.example.challenge102;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread red = new TrafficSignal(Color.RED);
        Thread yellow = new TrafficSignal(Color.YELLOW);
        Thread green = new TrafficSignal(Color.GREEN);

        red.start();
        red.join();

        yellow.start();
        yellow.join();

        green.start();
        green.join();
    }
}
