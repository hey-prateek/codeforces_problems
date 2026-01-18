//  Given a list of integers, sort all the values present in it using Stream functions

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortIntegerList {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        lst.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

    }
}
