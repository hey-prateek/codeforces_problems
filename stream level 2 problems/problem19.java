// How to find only duplicate elements with its count from the String ArrayList in Java8?

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem19 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("hey", "prateek", "hey", "prateek", "muskan");

        Map<String, Long> map = lst.stream().filter(s -> Collections.frequency(lst, s) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.print(map);

        // or can also use this

        // Map<String, Long>
        // map1=lst.stream().collect(Collectors.groupingBy(Function.identity(),
        // Collectors.counting())).
        // entrySet().stream().filter(
        // s->s.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,
        // Map.Entry::getValue));

        // System.out.print(map1);

    }
}
