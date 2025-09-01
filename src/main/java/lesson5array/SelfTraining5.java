package lesson5array;

import java.util.Arrays;

public class SelfTraining5 {

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) { // length-1 as we don't need to compare the last element
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public Integer maxTriple(int[] nums) {
        if (nums.length % 2 == 0) {
//            throw new IllegalArgumentException("Array length must be odd");
            return null;
        }

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Math.max(Math.max(first, middle), last);

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(nums[0]);
//        numbers.add(nums[nums.length-1]);
//        numbers.add(nums[nums.length/2]);
//        int max = numbers.get(0);
//        for (int i = 1; i < numbers.size(); i++) {
//            max = Math.max(max, numbers.get(i));
//        }
//        return max;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < Math.min(4, nums.length); i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public void square(int[] nums) {
        String[] squareNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int square = (int) Math.pow(nums[i], 2);
            squareNums[i] = String.valueOf(square);
        }
        System.out.println(Arrays.toString(squareNums));
    }
}
