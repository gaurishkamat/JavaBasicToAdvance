package org.example;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


class EnumTest{
    public static void main(String[] args) {
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}