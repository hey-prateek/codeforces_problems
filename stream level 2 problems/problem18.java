// How to count each element/word from the String ArrayList in Java8

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class problem18 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("hey", "prateek", "hey", "prateek");

        Map<String, Long> map = lst.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        // or can also use
        // Map<String,Long> map =
        // lst.stream().collect(Collectors.groupingBy(Function.identity(),
        // Collectors.counting()));

        System.out.print(map);
    }
}
