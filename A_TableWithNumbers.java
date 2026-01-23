// A_TableWithNumbers

import java.util.*;

public class A_TableWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            int rowOnly = 0;
            int colOnly = 0;
            int both = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x <= h && x <= l) both++;
                else if (x <= h) rowOnly++;
                else if (x <= l) colOnly++;
            }

            int totalUsable = rowOnly + colOnly + both;

            int answer = Math.min(
                    Math.min(rowOnly + both, colOnly + both),
                    totalUsable / 2
            );

            System.out.println(answer);
        }

        sc.close();
    }
}

