// Print elements of a stream during processing without altering the stream

import java.util.Arrays;
import java.util.List;

public class peekElements {
    public static void main(String[] args)
    {
        List<Integer> lst=Arrays.asList(1,2,3,4,5,6);

        Long n=lst.stream().peek(System.out::println).filter(s -> s%2==0).count();

        System.out.print("count of even nums" +n);
    }
}
