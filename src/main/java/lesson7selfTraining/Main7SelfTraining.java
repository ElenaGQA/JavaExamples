package lesson7selfTraining;

public class Main7SelfTraining {

    public static void main(String[] args) {
        SelfTraining selfTraining = new SelfTraining();

        String[] UserTypedArray1 =  {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] CorrectArray1 = {"cat", "blue", "sky", "umbrella", "paddy"};
        String[] UserTypedArray2 =  {"it", "is", "find"};
        String[] CorrectArray2 = {"it", "is", "fine"};
        String[] UserTypedArray3 =  {"april", "showrs", "bring", "may", "flowers"};
        String[] CorrectArray3 = {"april", "showers", "bring", "may", "flowers"};

        System.out.println(selfTraining.correctStream(UserTypedArray1, CorrectArray1));
        System.out.println(selfTraining.correctStream(UserTypedArray2, CorrectArray2));
        System.out.println(selfTraining.correctStream(UserTypedArray3, CorrectArray3));


        String fullName1 = "Trump Donald";
        String fullName2 = "O'Donnell Rosie";
        String fullName3 = "Butts Seymour";

        System.out.println(selfTraining.nameShuffle(fullName1));
        System.out.println(selfTraining.nameShuffle(fullName2));
        System.out.println(selfTraining.nameShuffle(fullName3));

        String word1 = "loop";
        String word2 = "yummy";
        String word3 = "orange";
        String word4 = "munchkin";

        System.out.println(selfTraining.doubleLetters(word1));
        System.out.println(selfTraining.doubleLetters(word2));
        System.out.println(selfTraining.doubleLetters(word3));
        System.out.println(selfTraining.doubleLetters(word4));

        String input1 = "A";
        String input2 = "ABC";
        String input3 = "ABCBACC";

        System.out.println(selfTraining.calculateScores(input1));
        System.out.println(selfTraining.calculateScores(input2));
        System.out.println(selfTraining.calculateScores(input3));

    }

}
