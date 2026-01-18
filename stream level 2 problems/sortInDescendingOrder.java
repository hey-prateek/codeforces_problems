// Given a list of integers, sort all the values present in it in descending order using Stream functions

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
