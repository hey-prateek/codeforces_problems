import java.util.Arrays;
import java.util.Scanner;

public class A_flipflops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                long c = sc.nextLong();
                long k = sc.nextLong();
                long temp;
                long[] arr = new long[n];

                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextLong();

                Arrays.sort(arr);

                for (int i = 0; i < n; i++) {

                    temp = arr[i];

                    if (temp <= c) {
                        if (k > 0 && c - temp > 0) {
                            if (c - temp <= k) {
                                k -= (c - temp);
                                c += (c - temp);
                            } else {
                                c += k;
                                k = 0;
                            }
                        }

                        c += temp;

                    }

                }
                System.out.println(c);

            }
        }
    }
}

// 1
// 10 9 2
// 8 1 8 11 17 3 14 16 20 10

// 119