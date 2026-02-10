import java.util.Scanner;

public class B_offshores {
    public static void main(String[] args) {

        // Using try-with-resources to automatically close Scanner
        try (Scanner sc = new Scanner(System.in)) {

            // Number of test cases
            int tc = sc.nextInt();

            // Process each test case
            while (tc-- > 0) {

                // n = number of banks
                // x = amount deducted in one transfer
                // y = amount credited after fees
                int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();

                // Array to store money in each bank
                int[] arr = new int[n];

                // Reading initial money in each bank
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                // Step 1:
                // Calculate total money that can be transferred
                // from all banks if they are used as sources
                // Each bank can contribute (arr[i] / x) * y rubles
                long combined = 0;
                for (int i = 0; i < n; i++) {
                    combined += (arr[i] / x) * y;
                }

                // Step 2:
                // Try making each bank the final target bank
                // Final money in bank i =
                // initial money in bank i
                // + total transferable money from all banks
                // - transferable money contributed by bank i itself
                long res = 0;
                for (int i = 0; i < n; i++) {

                    long current = arr[i] + combined - ((arr[i] / x) * y);

                    // Keep track of the maximum possible result
                    if (current > res)
                        res = current;
                }

                // Output the maximum money obtainable in any bank
                System.out.println(res);
            }
        }
    }
}
