// Flatten a nested list structure

import java.util.Arrays;
import java.util.List;

public class flattenNestedList {
    public static void main(String[] args) {
        List<List<String>> lst = Arrays.asList(Arrays.asList("hey", "prateek"), Arrays.asList("muskan", "singh"));

        // flatMap(List::stream) → for each inner list, get its stream

        lst.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
