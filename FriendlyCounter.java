import java.util.Scanner;

public class FriendlyCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tests = input.nextInt();

        while (tests-- > 0) {

            long target = input.nextLong();

            if (target % 9 != 0) {
                System.out.println(0);
                continue;
            }

            long count = 0;

            for (long candidate = target; candidate <= target + 100; candidate++) {
                if (candidate - digitSum(candidate) == target) {
                    count++;
                }
            }

            System.out.println(count);
        }

        // input.close();
    }

    private static long digitSum(long n) {
        long total = 0;

        while (n > 0) {
            total += n % 10;
            n /= 10;
        }

        return total;
    }
}
