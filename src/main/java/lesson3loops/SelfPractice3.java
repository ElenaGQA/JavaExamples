package lesson3loops;

public class SelfPractice3 {
    public static void main(String[] args) {
        SelfPractice3 practice = new SelfPractice3();
        practice.nearHundred(93);
        practice.nearHundred(190);
        practice.nearHundred(89);
        practice.lastDigit(7, 17);
        practice.lastDigit(6, 17);
        practice.lastDigit(3, 113);
        practice.maxInt(1, 2, 3);
        practice.maxInt(6, 5, 4);
        practice.maxInt(7, 9, 8);
        practice.love(7, 4);
        practice.love(1, 4);
        practice.love(2, 5);
        practice.answerCell(false, false, false);
        practice.answerCell(false, false, true);
        practice.answerCell(true, true, false);
        practice.equalSlices(11, 5, 2);
        practice.equalSlices(11, 5, 3);
        practice.equalSlices(8, 3, 2);
        practice.equalSlices(8, 3, 3);
        practice.equalSlices(24, 12, 2);
    }

    public void nearHundred(int n) {
        if (n >= 10 && n <= 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void lastDigit(int n1, int n2) {
        if (n2 % 10 == n1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void maxInt(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("The biggest number is " + a);
        } else if (b > c) {
            System.out.println("The biggest number is " + b);
        } else {
            System.out.println("The biggest number is " + c);
        }
    }

    public void love(int a, int b) {
        if (a == 7 || b == 7 || a + b == 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMom || !isMorning && !isMom && !isAsleep) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void equalSlices(int totalSlices, int numberPeople, int slicesEach) {
        if (numberPeople * slicesEach <= totalSlices) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}