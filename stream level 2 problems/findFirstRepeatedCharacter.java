//  Given a String, find the first repeated character in it using Stream functions

public class findFirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "hey prateek";

        Character c = str.chars().mapToObj(s -> (char) s).filter(s -> str.indexOf(s) != str.lastIndexOf(s)).findFirst()
                .orElse(null);
        System.out.print(c);
    }
}
