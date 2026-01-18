// Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.Arrays;
import java.util.List;

public class startsWith1 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 14, 15, 24, 26, 111);

        lst.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
    }
}