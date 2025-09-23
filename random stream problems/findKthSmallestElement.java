//Find the kth smallest element in an array using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findKthSmallestElement {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(9, 8, 7, 1, 2, 3, 4, 5));
        System.out.print(lst.stream().distinct().sorted().skip(2).findFirst());
    }
}
