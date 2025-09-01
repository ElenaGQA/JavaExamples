package lesson5array;

import java.util.*;

public class ArrayExamples {
    public void stringsArray() {
        String[] buttons = {"Submit", "Cancel", "Login", "Sign-up"};
        System.out.println(buttons[2]); // Login
        buttons[2] = "Exit";
        int length = buttons.length;
        System.out.println(buttons[2]); // Exit
        System.out.println("Length is " + length); // Length is 4
    }

    public void stringsArrayWithSize() {
        String[] newArray = new String[4]; // this array has a limit that we give, in this case 4
        newArray[0] = "John";
        newArray[1] = "Anna";
        newArray[2] = "Tom";
        System.out.println("array length " + newArray.length); // array length 4
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]); // John Anna Tom null
        }
    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 7};
        System.out.println(ids[2]); // 5
        for (int id : ids) {    // equivalent to forEach
            System.out.println(id); // 12 3 5 7
        }
    }

    public void arrayListExample() {
        ArrayList<String> names = new ArrayList<String>(); // this array doesn't have limits
        names.add("John");
        names.add("Ana");
        names.add("Simon");
        names.add("Gil");
        System.out.println(names.get(3)); // Gil
        System.out.println();

        System.out.println("The size of the original list: " + names.size()); // 4
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)); // John Anna Simon Gil
        }

        names.add("Mary");
        System.out.println();

        System.out.println("The size of the modified list: " + names.size()); //5
        for (String name : names) {    // equivalent to forEach
            System.out.println(name);  // John Anna Simon Gil Mary
        }
        System.out.println();

        names.remove(1); // Ana will be removed
        System.out.println("The size of the list after remove: " + names.size()); // 4
        for (String name : names) {    // equivalent to forEach
            System.out.println(name); // John Simon Gil Mary
        }
        System.out.println();

        names.remove("Simon"); // Simon will be removed
        System.out.println("The size of the list after remove: " + names.size()); // 3
        for (String name : names) {    // equivalent to forEach
            System.out.println(name);  // John Gil Mary
        }
        System.out.println();

        names.clear();
        System.out.println("The size of the list after clear: " + names.size()); // 0
    }

    public void arrayListSortExamoles() {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("green");
        colors.add("white");
        colors.add("yellow");
        colors.add("red");
        Collections.sort(colors);
        for (String color : colors) {
            System.out.println(color);
        }
    }

    public void arrayListSortIntExamoles() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(23);
        num.add(213);
        num.add(14);
        num.add(103);

        Collections.sort(num);
        for (Integer i : num) {
            System.out.println(i);
        }
    }

    public void hashMapExample() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("John", "Toronto");
        hashMap.put("Mary", "New York");
        hashMap.put("Anna", "London");
        hashMap.put("Rob", "Paris");
        System.out.println(hashMap);   // {Rob=Paris, John=Toronto, Mary=New York, Anna=London}
        System.out.println(hashMap.get("Anna"));   // London
        if (hashMap.containsKey("Rob")) {
            System.out.println("Found!");   // Found!
        }
        hashMap.remove("John");
        System.out.println(hashMap.size());   // 3
    }

    public void hashSetExamples() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Mary");
        hashSet.add("Anna");
        System.out.println(hashSet);   // [John, Mary, Anna]

        List<String> list = new ArrayList<String>(hashSet); // converting hashSet into ArrayList
        Collections.sort(list);
        System.out.println(list);     //[Anna, John, Mary]
    }
}
