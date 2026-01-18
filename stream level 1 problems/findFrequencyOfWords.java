// find frequency of words in a list

import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class findFrequencyOfWords
{
    public static void main(String[] args) {

        List<String> lst = Arrays.asList("hey", "hey", "prateek", "tiwari");
        
        Map<String, Long> map=lst.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.print(map);

    }

}