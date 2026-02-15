import java.util.Scanner;

public class B_heapify1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int LG = 20; // enough for n ≤ 2e5

            for (int t = 0; t < LG; t++) {
                for (int i = 0; i * 2 + 1 < n; i++) {
                    if (a[i] > a[i * 2 + 1]) {
                        int temp = a[i];
                        a[i] = a[i * 2 + 1];
                        a[i * 2 + 1] = temp;
                    }
                }
            }

            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    sorted = false;
                    break;
                }
            }

            System.out.println(sorted ? "Yes" : "No");

        }
    }
}