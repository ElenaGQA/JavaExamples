package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        String hello = "Hello";
        String name = "Elena Grebeniuk";

        int a = -3;
        int b = 5;
        int c = 6;
        int d = 8;
        int e = 20;

        double result1 = -b + d * c; // we can assign "-" during calculations and during initialization
        double result2 = e + (double) a * b / d;

        double ad = 1.5;
        double bd = 2.5;
        double cd = 3.5;
        double dd = 4.5;
        double ed = 5.5;

        double result3 = (double) ad*bd*cd*dd*ed;




        System.out.println(hello  + "\n" + name);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(ad + " * " + bd + " * " + cd + " * " + dd + " * " + ed + " = " + result3);
    }
}
