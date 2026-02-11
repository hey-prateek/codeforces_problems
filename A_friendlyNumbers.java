import java.util.Scanner;

public class A_friendlyNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                long n = sc.nextLong();
                if (n % 9 != 0)
                    System.out.println("0");
                else {
                    long res = 0;
                    for (long i = (n + 1); i <= n + 100; i++) {
                        if (i - sumOfDigits(i) == n)
                            res++;
                    }
                    System.out.println(res);
                }
            }
        }
    }

    static long sumOfDigits(long n) {
        n = Math.abs(n);
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
