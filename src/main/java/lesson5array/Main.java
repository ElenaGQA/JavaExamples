package lesson5array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
        arrayExamples.stringsArray();
        arrayExamples.stringsArrayWithSize();
        arrayExamples.integerArray();
        arrayExamples.arrayListExample();
        arrayExamples.arrayListSortExamoles();
        arrayExamples.arrayListSortIntExamoles();
        arrayExamples.hashMapExample();
        arrayExamples.hashSetExamples();


        Homework5 homework4 = new Homework5();
        System.out.println(homework4.getDay(2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int id = Integer.parseInt(scanner.next());
        System.out.println(homework4.getToyById(id));

        System.out.println(homework4.removeDuplicateNames());

        SelfTraining5 selfTraining4 = new SelfTraining5();
        System.out.println(selfTraining4.has22(new int[] {1, 2, 2}));
        System.out.println(selfTraining4.has22(new int[] {1, 2, 1, 2}));
        System.out.println(selfTraining4.has22(new int[] {2, 1, 2}));

        System.out.println(selfTraining4.lucky13(new int[]{0, 2, 4}));
        System.out.println(selfTraining4.lucky13(new int[]{1, 2, 3}));
        System.out.println(selfTraining4.lucky13(new int[]{1, 2, 4}));

        System.out.println(selfTraining4.maxTriple(new int[]{1, 2, 3, 4}));
        System.out.println(selfTraining4.maxTriple(new int[]{1, 2, 3}));
        System.out.println(selfTraining4.maxTriple(new int[]{1, 5, 3}));
        System.out.println(selfTraining4.maxTriple(new int[]{5, 1, 2, 4, 3}));

        System.out.println(selfTraining4.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(selfTraining4.arrayFront9(new int[]{1, 2, 9}));
        System.out.println(selfTraining4.arrayFront9(new int[]{1, 2, 3}));
        System.out.println(selfTraining4.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(selfTraining4.arrayFront9(new int[]{1, 2, 3, 4, 5}));

        selfTraining4.square(new int[]{1, 2, 3});
        selfTraining4.square(new int[]{6, 8, -6, -8, 1});
    }


}
