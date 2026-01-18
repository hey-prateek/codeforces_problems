// Skip Elements

import java.util.Arrays;
import java.util.List;

public class skipElements {
    public static void main(String[] args)
    {
        List<Integer> lst=Arrays.asList(1,2,3,4,5,6);

        lst.stream().skip(3).forEach(System.out::println);
    }
}
