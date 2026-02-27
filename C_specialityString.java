import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class C_specialityString {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        for (int t = s.nextInt(); t-- > 0;) {
            s.nextInt();
            Deque<Character> d = new ArrayDeque<>();
            for (char c : s.next().toCharArray())
                if (!d.isEmpty() && d.peek() == c)
                    d.pop();
                else
                    d.push(c);
            System.out.println(d.isEmpty() ? "YES" : "NO");
        }
    }
}
