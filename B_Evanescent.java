import java.util.Scanner;

public class B_Evanescent {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int tc = sc.nextInt();

            while (tc-- > 0) {

                int n = sc.nextInt();
                String s = sc.next();

                // Initial compressed length (number of runs)
                int runs = 1;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) != s.charAt(i - 1))
                        runs++;
                }

                int ans = runs;

                // Try deleting every valid character
                for (int i = 1; i < n - 1; i++) {

                    char left = s.charAt(i - 1);
                    char cur = s.charAt(i);
                    char right = s.charAt(i + 1);

                    int before = 0;
                    if (left != cur)
                        before++;
                    if (cur != right)
                        before++;

                    int after = (left != right) ? 1 : 0;

                    ans = Math.min(ans, runs - before + after);
                }

                System.out.println(ans);
            }
        }
    }
}