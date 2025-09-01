package lesson3loops;

public class Lesson3MainLoops {
    public static void main(String[] args) {
        Lesson3MainLoops loops = new Lesson3MainLoops();
        loops.countNumbers(1);
        loops.countNumbers();
        loops.numbersPyramid(9);
        loops.pyramidOdd(9);
    }

    public void countNumbers(int i) {
        while (i <= 5) {
            System.out.println(i);
            i += 1;
//            i++;
        }
    }

    public void countNumbers() {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i);
        }
    }

    public void numbersPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // j - printing numbers in the row
            }
            System.out.println();
        }
    }

    public void pyramidOdd(int rows) {
        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 7) {                   // without break it will print 2 more rows for 7 and 9
                break;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " "); // i - printing row number
            }
            System.out.println();
        }
    }
}
