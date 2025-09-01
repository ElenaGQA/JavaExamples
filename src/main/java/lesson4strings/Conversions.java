package lesson4strings;

public class Conversions {
    public static void main(String[] args) {
        String txt = "5";                   // "5"
        int intTxt = Integer.parseInt(txt); // 5
        int result1 = intTxt + 2;
        System.out.println(result1);

        int num1 = 555;                         //555
        String result2 = String.valueOf(num1);  // "555"
        System.out.println(result2);
        System.out.println(result2.length());

        String name = "Vasiliy";
        String gender = "male";
        int age = 20;
        double salary = 5000.50;
//        System.out.println("The name is " + name + ", the gender is " + gender + ", the age is " + age + ", the salary is " + salary + " USD");
        System.out.println(String.format("The name is %s, the gender is %s, the age is %d, the salary is %f", name, gender, age, salary));
    }
}
