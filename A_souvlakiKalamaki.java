import java.util.Arrays;
import java.util.Scanner;

public class A_souvlakiKalamaki {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);

                for (int i = 1; i <= n - 2; i += 2) {
                    if (arr[i] != arr[i + 1]) {
                        flag = false;
                        break;
                    }
                }
                System.out.println(flag ? "yes" : "no");
            }
        }
    }
}
