import java.util.Scanner;

public class A_eatingGame {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int maxval = Integer.MIN_VALUE, count = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] > maxval) {
                        maxval = arr[i];
                        count = 1;
                    } else if (arr[i] == maxval) {
                        count++;
                    }
                }
                if (n == 1)
                    System.out.println(1);
                else {
                    System.out.println(count);
                }
            }
        }
    }
}
