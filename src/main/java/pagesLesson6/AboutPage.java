package pagesLesson6;

public class AboutPage extends Page {
    String Disclaimer;

    public void getDeveloperName() {
        System.out.println("Mary Johns");
    }
}

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Flapping wings");
    }
}







