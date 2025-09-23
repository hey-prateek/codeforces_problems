//Find the intersection of two lists using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findIntersectionOf2Lists {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> lst2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        System.out.print(lst1.stream().filter(s -> lst2.contains(s)).findFirst().orElse(0));
    }
}
