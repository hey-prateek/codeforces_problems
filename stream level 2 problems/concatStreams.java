// Write a Java 8 program to concatenate two Streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class concatStreams {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lst2 = Arrays.asList(6, 7, 8, 9, 0);

        Stream<Integer> res = Stream.concat(lst1.stream(), lst2.stream());

        res.forEach(System.out::println);

    }
}
