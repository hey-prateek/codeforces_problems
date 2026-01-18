// Write a program to print the count of each character in a String?

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class problem22 {
    public static void main(String[] args) {
        String str = "hey hey prateek prateek tiwari";
        Map<String, Long> map = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));

        System.out.print(map);
    }
}
