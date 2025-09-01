package lesson7selfTraining;

import java.util.Arrays;

public class SelfTraining {


    public String correctStream(String[] strUser, String[] strCorrect) {
        String[] UserTypedArray = strUser;
        String[] CorrectArray = strCorrect;
        int[] results = new int[UserTypedArray.length];
        for (int i = 0; i < UserTypedArray.length; i++) {
            if (UserTypedArray[i].equals(CorrectArray[i])) {
                results[i] = 1;
            } else results[i] = -1;
        }
        return Arrays.toString(results);
    }

    public String nameShuffle(String fullName) {
        String[] parts = fullName.split(" ");
        String reversed = parts[1] + " " + parts[0];
        return reversed;
    }

    public boolean doubleLetters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public String calculateScores(String input){
        int[] scores = new int[3];

        for (char player : input.toCharArray()) { // convert string to char array
            if (player == 'A') scores[0]++;
            else if (player == 'B') scores[1]++;
            else if (player == 'C') scores[2]++;
        }
        return Arrays.toString(scores);
    }

}
