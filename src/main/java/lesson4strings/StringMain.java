package lesson4strings;

public class StringMain {
    public static void main(String[] args) {
        StringMain stringsMain = new StringMain();

        int res = stringsMain.sumOfTwoNumbers(2, 3);
        System.out.println("The result is " + res);

        System.out.println(stringsMain.getText());
    }

    public int sumOfTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public String getText(){
        return "this is the text";
    }
}
