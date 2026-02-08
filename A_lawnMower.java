import java.util.Scanner;

public class A_lawnMower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                // int n = sc.nextInt(), k = sc.nextInt();
                // if (k == 1 || n == k)
                // System.out.println("0");
                // else if (n < k)
                // System.out.println(n);
                // else {
                // System.out.println((int) (Math.floor(n / k) * (k - 1)) + (n % k));
                // }

                long n = sc.nextLong();
                long w = sc.nextLong();

                if (w == 1) {
                    System.out.println(0);
                } else {
                    System.out.println(n - (n / w));
                }
            }
        }
    }
}
