package lesson2;

public class Lesson2Main {
    public static void main(String[] args) {
//        String txtToPrint = "Hello, World!";
        int num = 5;
        double doubleNum = 5.5;
        long longNum = 1234567890;
        boolean booleanVar2 = false;
        int a = 100;
        int b = 200;
        int result = a + b;
        double res = (double) a / b;
        System.out.println(result); // 300
        System.out.println(res); // 0.5

        String test = "Abc";
        System.out.println(test.toUpperCase().length()); // 3

//        String test1 = "dog";
//        test1 =null;
//        System.out.println(test1.toUpperCase()); // gives error, can not apply methods on null

//        System.out.println(txtToPrint);
//        System.out.println("Number is " + num);
//        System.out.println("Number is " + doubleNum);
//        System.out.println("Number is " + longNum);
//        System.out.println("Number is " + booleanVar);
//        System.out.println("Number is " + booleanVar2);

        int c = 5;
        String list = "";
        while (c < 11) {
            c = c + 2;
            if (c % 2 == 1)
                list = c + " " + list;
        }
        System.out.print(list);  // 11 9 7
    }
}


