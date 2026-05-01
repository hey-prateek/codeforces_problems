import java.util.*;

public class Main {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();

            long ans = 0;

            for (int l = 0; l < n; l++) {
                int g = 0, mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;

                for (int r = l; r < n; r++) {
                    g = gcd(g, p[r]);
                    mn = Math.min(mn, p[r]);
                    mx = Math.max(mx, p[r]);

                    if (r > l && (mx - mn == g)) {
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}