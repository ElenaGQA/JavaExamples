package lesson4strings;

public class Homework4 {


    public static void main(String[] args) {
        String a = "Category";
        String b = "Cat";
        String c = "racecar";
        Homework4 homework = new Homework4();
        System.out.println(homework.compareStrings(a, b));
        System.out.println(homework.isPalindrome(c));
    }

    public String compareStrings(String str1, String str2) {
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty() || str1.isBlank() || str2.isBlank()) {
            return "Cannot compare Strings";
        } else if (str1.toLowerCase().equals(str2.toLowerCase())) {
            return "The Strings are the same";
        } else if (str1.toLowerCase().contains(str2.toLowerCase())) {
            return "Cat is the part of Category";
        } else if (str2.toLowerCase().contains(str1.toLowerCase())) {
            return "Category is the part of Cat";
        } else {
            return "The strings are not the same";
        }
    }

    public boolean isPalindrome(String text) {
        if (text == null || text.isEmpty() || text.isBlank()) {
            System.out.println("Error: the text is null/empty/blank");
            return false;
        } else {
            int textLength = text.length() - 1;
            int index = 0;
            while (index < textLength) {
                if (text.charAt(index) != text.charAt(textLength)) {
                    return false;
                }
                textLength--;
                index++;
            }
            return true;
//            String reversedText = "";
//            for (int i = textLength; i >= 0; i--) {
//                reversedText += text.charAt(i);
//            }
//            return text.equals(reversedText);
        }
    }
}
