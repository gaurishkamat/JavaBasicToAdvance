package org.example.challenge102;

public enum Color {
    RED(5000), YELLOW(2000), GREEN(4000);

    private final int time;

    Color(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
