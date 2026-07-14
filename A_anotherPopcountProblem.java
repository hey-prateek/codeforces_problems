//AI written

import java.io.IOException;
import java.util.Scanner;

public class A_anotherPopcountProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long ans = 0;
            long rem = n;
            for (int j = 0; j < 60; j++) { // enough bits
                long c = 1L << j;
                if (c > rem) {
                    // For this and higher, can't take even 1
                    // But we can still take lower if any, but since we go sequentially, done
                    break;
                }
                long canTake = rem / c;
                long take = Math.min(canTake, k);
                ans += take;
                rem -= take * c;
                if (rem == 0)
                    break;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
