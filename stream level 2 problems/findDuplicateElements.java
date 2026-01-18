// How to find duplicate elements in a given integers list in java using Stream functions

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateElements {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7);

        // first method
        // lst.stream().filter(s -> (Collections.frequency(lst, s)>1)).distinct().forEach(System.out::println);

        // second menthod
        Set<Integer> set = new HashSet<>();
        lst.stream().filter(s -> !set.add(s)).forEach(System.out::println);
    }
}
