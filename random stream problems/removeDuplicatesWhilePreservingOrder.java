//Remove duplicates from a list while preserving the order using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicatesWhilePreservingOrder {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 2, 3));

        lst1.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
