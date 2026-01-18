// print all the missing numbers in this array using streams

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 8, 9, 10 };

        // create a set or list containing all elements in this range
        Set<Integer> set = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toSet());

        // convert int array to list
        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // iterate through newly created set checking for missing values
        set.stream().filter(s -> !lst.contains(s)).forEach(System.out::println);

    }
}