//Implement a method to partition a list into two groups based on a predicate using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class partitionUsingPredicate {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Predicate<Integer> pred = s -> s >= 5;

        Map<Boolean, List<Integer>> map = lst.stream().collect(Collectors.partitioningBy(pred));

        System.out.print(map);
    }

}
