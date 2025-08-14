// Given a list of strings, find the frequency of each word using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findFrequencyOfEachWord {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("hey", "prateek", "hey", "prateek"));

        Map<String, Long> map = lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((s1, s2) -> System.out.println(s1 + "  " + s2));
    }
}
