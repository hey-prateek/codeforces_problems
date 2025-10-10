import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_CircleOfAppleTrees {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), temp, res = 0;
                Set<Integer> lst = new HashSet();
                for (int i = 0; i < n; i++) {
                    temp = sc.nextInt();
                    lst.add(temp);
                }
                System.out.println(lst.size());
            }
        }
    }
}
