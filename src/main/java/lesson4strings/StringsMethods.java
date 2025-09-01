package lesson4strings;

public class StringsMethods {
    public static void main(String[] args) {
        StringsMethods stringMethod = new StringsMethods();
        stringMethod.stringExamples();
    }

    public void stringExamples() {
        String text1 = "cat";
        String text2 = "catalog";
        String text3 = "dog";

        System.out.println(text2.contains(text1));// true or false
        System.out.println(text2.replace("cat","dog" )); // catalog to dogalog
        System.out.println(text3.charAt(0)); // d
        System.out.println(text3.charAt(1)); // o
        System.out.println(text3.charAt(2)); // g
        System.out.println(text3.charAt(text3.length()-1)); // g
    }
}
