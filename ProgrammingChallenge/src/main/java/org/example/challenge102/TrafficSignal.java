package org.example.challenge102;

public class TrafficSignal extends Thread{
    private final Color color;

    public TrafficSignal(Color color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("Traffic signal is %s\n", color);
        try {
            Thread.sleep(color.getTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
