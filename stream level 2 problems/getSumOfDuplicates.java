import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class getSumOfDuplicates {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 1);

        int res = lst.stream().filter(s -> Collections.frequency(lst, s) > 1).mapToInt(Integer::intValue).sum();

        // or can use below
        // int res = lst.stream().filter(s -> Collections.frequency(lst, s) > 1).reduce(0, (a,b)-> a+b);

        System.out.println(res);


        // int[] arr=new int[]{1,2,3,4,5};
        // System.out.println(Arrays.stream(arr).sum());
    }
}