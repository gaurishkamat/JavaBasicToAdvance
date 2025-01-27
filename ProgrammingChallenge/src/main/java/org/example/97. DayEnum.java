package org.example;

enum DayEnum {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    DayEnum(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public String getType(){
        return  isWeekDay ? "Weekday" : "Weekend";
    }
}


class EnumClass{
    public static void main(String[] args) {
        System.out.println("Printing all the days enum");

        for (DayEnum day : DayEnum.values()) {
            System.out.println(day + ": " + day.getType());
        }
    }
}