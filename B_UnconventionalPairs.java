import java.util.Arrays;
import java.util.Scanner;

public class B_UnconventionalPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int max = Integer.MIN_VALUE;
            int l = 0, r = 1;
            while (r < n) {
                int diff = Math.abs(arr[l] - arr[r]);
                if (max < diff)
                    max = diff;
                l += 2;
                r += 2;
            }
            System.out.println(max);
        }
        sc.close();
    }
}
