import java.util.Scanner;

public class B_deletionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), sort = 0;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (i > 0 && arr[i] >= arr[i - 1]) {
                        sort++;
                    }
                }
                if (sort == n - 1)
                    System.out.println(n);
                else
                    System.out.println(1);
            }
        }
    }
}
