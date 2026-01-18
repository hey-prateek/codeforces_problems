// Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class findFirstElement {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lst1 = Arrays.asList();
        lst.stream().findFirst().ifPresent(System.out::println);
        lst1.stream().findFirst().ifPresentOrElse(s -> System.out.print(s), () -> System.out.print("empty list"));

    }
}
