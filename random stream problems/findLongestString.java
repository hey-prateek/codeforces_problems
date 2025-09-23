//Find the longest string in a list of strings using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class findLongestString {
    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("heypra", "tiwari", "batball", "abcdef", "kjjdihvj"));

        String res = lst.stream().max(Comparator.comparing(String::length)).orElse(null);

        System.out.print(res);
    }
}