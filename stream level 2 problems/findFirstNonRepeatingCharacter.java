// Given a String, find the first non-repeated character in it using Stream functions?

public class findFirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "hey prateek";
        String str1 = "hheeyy";

        Character res1 = str.chars().mapToObj(s -> (char) s).filter(s -> str.indexOf(s) == str.lastIndexOf(s))
                .findFirst().orElse(null);
        Character res2 = str1.chars().mapToObj(s -> (char) s).filter(s -> str1.indexOf(s) == str1.lastIndexOf(s))
                .findFirst().orElse(null);

        System.out.print(res1+" "+res2);

    }
}
