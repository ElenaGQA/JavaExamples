package lesson4strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "cat";
        System.out.println("The original String is: " + str);
        ReverseString reverse = new ReverseString();
        System.out.println("The reversed String is: " + reverse.reverseString(str));
    }

    public String reverseString(String stringToReverse) {
        if (stringToReverse == null || stringToReverse.isEmpty() || stringToReverse.isBlank()) {
            return "The String is null or empty";
        } else {
            int length = stringToReverse.length() - 1;
            String newStr = "";
            for (int i = length; i >= 0; i--) {
                newStr += stringToReverse.charAt(i);
            }
            return newStr;
        }
    }
}
