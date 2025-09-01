package lesson5array;

import java.util.*;

public class Homework5 {

    public String getDay(int day) {
        if (day < 1 || day > 7) return "Invalid day number";
//        ArrayList<String> weekdaysList = new ArrayList<String>();
//        weekdaysList.add("Sunday");
//        weekdaysList.add("Monday");
//        weekdaysList.add("Tuesday");
//        weekdaysList.add("Wednesday");
//        weekdaysList.add("Thursday");
//        weekdaysList.add("Friday");
//        weekdaysList.add("Saturday");
//        System.out.println(weekdaysList);
//        return weekdaysList.get(day - 1); // to get Monday for day input 2 add -1
        List<String> weekdays = List.of("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        return weekdays.get(day - 1);
    }



    private static final Map<Integer, String> TOYS = Map.of(
            12, "Batmobile",
            45, "Light Saber",
            6, "Wonder Woman",
            201, "Hello Kitty Bag",
            56, "Junior QA Analyst Doll"
    );
    public String getToyById(int id) {
        return TOYS.getOrDefault(id, "No such Toy");
    }




    public List<String>removeDuplicateNames()  {
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(
                "Steve", "Tim", "Lucy", "Steve", "Pat", "Angela", "Tom", "Tim", "Anna", "Lucy"
        ));
        Collections.sort(nameList);
        Set<String> uniqueNames = new LinkedHashSet<>(nameList);  // keep order + remove duplicates
        return new ArrayList<>(uniqueNames);
    }
}