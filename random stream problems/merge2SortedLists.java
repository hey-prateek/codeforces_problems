//Merge two sorted lists into a single sorted list using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class merge2SortedLists {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> lst2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

        // List<Integer> lst3=Stream.concat(lst1.stream(),lst2.stream()).sorted().collect(Collectors.toList());
        List<Integer> lst3 = Stream.of(lst1.stream(), lst2.stream()).flatMap(s -> s).sorted()
                .collect(Collectors.toList());
        lst3.forEach(System.out::println);
    }
}
