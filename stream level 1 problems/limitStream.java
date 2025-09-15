// Limit the output to the first 3 elements of the list

import java.util.Arrays;
import java.util.List;

public class limitStream {
    public static void main(String[] args)
    {
        List<Integer> lst=Arrays.asList(1,2,3,4,5,6);

        lst.stream().limit(3).forEach(System.out::println);
    }
}
