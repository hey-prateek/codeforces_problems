// Given an integer array nums, return true if any value appears at least twice in the array, and
// return false if every element is distinct

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem11 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9 };
        int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Set<Integer> set = new HashSet<>();
        Boolean res = Arrays.stream(nums).boxed().anyMatch(s -> !set.add(s));

        System.out.println(res);

        set.clear();

        res = Arrays.stream(nums1).boxed().anyMatch(s -> !set.add(s));

        System.out.println(res);
    }
}
