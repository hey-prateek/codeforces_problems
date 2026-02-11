// ----------------------FAILED--------------------

import java.util.Scanner;

public class B_arrayAndPermutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();
            int[] p = new int[n];
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                p[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (p[i] != a[i] && ((i < n - 1) && p[i + 1] == a[i])) {
                    p[i] = p[i + 1];
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                if (p[i] != a[i] && ((i > 0) && (p[i - 1] == a[i]))) {
                    p[i] = p[i - 1];
                } else if (p[i] != a[i] && ((i < n - 1) && (p[i + 1] == a[i]))) {
                    p[i] = p[i + 1];
                }
            }

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != p[i]) {
                    System.out.println("no");
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("yes");

        }
    }
}