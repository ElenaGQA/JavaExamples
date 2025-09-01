package lesson4strings;

public class SelfTraining4 {

    public static void main(String... arg) {
        SelfTraining4 selfTraining = new SelfTraining4();

//        System.out.println(selfTraining.addChars("dog"));
//        System.out.println(selfTraining.addChars("red"));
//        System.out.println(selfTraining.addChars("xy"));
//
//        System.out.println(selfTraining.maxStart("max snacks"));
//        System.out.println(selfTraining.maxStart("pax snacks"));
//        System.out.println(selfTraining.maxStart("paz snacks"));

//        System.out.println(selfTraining.fizzString("fig"));
//        System.out.println(selfTraining.fizzString("dib"));
//        System.out.println(selfTraining.fizzString("fib"));
//        System.out.println(selfTraining.fizzString("lol"));

//        System.out.println(selfTraining.bigThere("xycbib"));
//        System.out.println(selfTraining.bigThere("b9b"));
//        System.out.println(selfTraining.bigThere("bac"));

//        System.out.println(selfTraining.stringTimes("Hi", 2));
//        System.out.println(selfTraining.stringTimes("Hi", 3));
//        System.out.println(selfTraining.stringTimes("Hi", 1));

        System.out.println(selfTraining.isPlural("changes"));
        System.out.println(selfTraining.isPlural("change"));
        System.out.println(selfTraining.isPlural("dudes"));
        System.out.println(selfTraining.isPlural("magic"));
    }

    public String addChars(String str) {
        String newStr = "";
        String lastChar = String.valueOf(str.charAt(str.length() - 1));
        newStr = lastChar + str + lastChar;
        return newStr;
    }

    public boolean maxStart(String str) {
        String newStr = str.toLowerCase();
        if (newStr.charAt(1) == 'a' && newStr.charAt(2) == 'x') {
            return true;
        } else {
            return false;
        }
    }

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }


    public boolean bigThere(String str) {
        if (str.length() < 3) return false;
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public String stringTimes(String str, int n) {
        String newStr = "";
        for (int i = 1; i <= n; i++) {
            newStr = newStr + str;
        }
        return newStr;
    }

    public boolean isPlural(String str){
        if(str.charAt(str.length()-1) == 's') return true;
        else return false;
    }

}
