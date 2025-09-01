package lesson3loops;

public class Homework3 {
    public static void main(String[] args) {
        Homework3 stars = new Homework3();
        int numOfPyramidRows = 6;
        stars.starsPyramid(numOfPyramidRows);

        int limit = 20;
        for (int i = 1; i <= limit; i++) {   // I used 20 instead of 100 to get less info in console
            boolean divisibleBy2 = (i % 2 == 0);
            boolean divisibleBy3 = (i % 3 == 0);
            if (divisibleBy2 && divisibleBy3) {
                System.out.println("The number " + i + " is ‘divisible by two and three’");
            } else if (divisibleBy3) {
                System.out.println("The number " + i + " is ‘divisible by three’");
            } else if (divisibleBy2) {
                System.out.println("The number " + i + " is even");
            } else {
                System.out.println("The number " + i + " is odd");
            }
        }

        int a = 0;
        int b = 3;
        for (int i = 1; i <= b; i++) {
            a += i;
        }
        System.out.println("The answer is: " + a);

    }

    public void starsPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
