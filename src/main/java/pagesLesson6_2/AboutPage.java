package pagesLesson6_2;

public class AboutPage extends Page implements PageInterface{
    String Disclaimer;

    public void getDeveloperName(){
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







