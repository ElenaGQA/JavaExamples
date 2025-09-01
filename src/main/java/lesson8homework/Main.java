package lesson8homework;

public class Main {
    public static void main(String[] args) {
        Weekdays weekdays = new Weekdays();
        System.out.println(weekdays.getDay(1));
        System.out.println(weekdays.getDay(0));
        System.out.println(weekdays.getDay(8));
        System.out.println(weekdays.getDay(null));
    }

}
