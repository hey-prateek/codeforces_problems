import java.util.Scanner;

public class B_simonsAndCakesForSuccess {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                long n = sc.nextLong();
                int ans = 1;
                for (long i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        ans *= i; // 2
                        while (n % i == 0) // 12,6,3
                            n /= i;
                    }
                }
                if (n > 1)
                    ans *= n;
                System.out.println(ans);
            }
        }
    }
}