import java.util.*;

public class B_OIEExcursion {

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int same = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                same++;
            } else {
                same = 1;
            }

            if (same >= m) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}