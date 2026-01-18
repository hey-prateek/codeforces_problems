// Given a list of integers, find the maximum value element present in it using Stream functions

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findMaxElement {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

        int max = lst.stream().max(Comparator.naturalOrder()).get();

        int min = lst.stream().min(Comparator.naturalOrder()).get();

        System.out.print(max + " " + min);

    }
}
