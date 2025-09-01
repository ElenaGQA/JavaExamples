package lesson3loops;

public class Lesson3Main {
    public static void main(String[] args) {
        Lesson3Main lesson2 = new Lesson3Main();
        boolean isBonusAvailable = true;
        lesson2.printUserInfo("John Doe", 1);
        lesson2.checkScore("Jane Doe", 2, 30, isBonusAvailable);
        lesson2.checkScore("Liam Smith", 3, 55, isBonusAvailable);
        lesson2.checkScore("Anna Smith", 4, 65, isBonusAvailable);
        lesson2.checkScore("Diana Hall", 5, 111, isBonusAvailable);
    }

    public void printUserInfo(String userName, int userID) {
        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userID);
    }

    public void checkScore(String userName, int userID, int userScore, boolean isBonusAvailable) {
        System.out.println("The user name is " + userName);
        System.out.println("The user ID is " + userID);
        if (isBonusAvailable){
            userScore +=10;
        }
        if (userName.equals("Jane Doe")){
            userScore += 20;
            System.out.println(userScore);
        }
        if (userScore > 100 || userScore < 0) {
            System.out.println("Error");
        } else if (userScore >= 60) {
            System.out.println("Pass!");
        } else {
            System.out.println("Fail!");
        }
    }
}
