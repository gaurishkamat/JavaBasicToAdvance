package org.example.challenge80.library;

public class DVD extends LibraryItem{
    private int durationInMins;

    public DVD(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "durationInMins=" + durationInMins +
                '}';
    }
}
