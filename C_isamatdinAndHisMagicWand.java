import java.util.Arrays;
import java.util.Scanner;

public class C_isamatdinAndHisMagicWand {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), counteven = 0, countodd = 0;
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    // sc.nextLine();
                    if (arr[i] % 2 == 0)
                        counteven++;
                    else
                        countodd++;
                }
                if (n == 1) {
                    System.out.println(arr[0]);
                } else if (counteven > 0 && countodd > 0) {
                    Arrays.sort(arr);
                    for (int i : arr)
                        System.out.print(i + " ");
                } else {
                    for (int i : arr)
                        System.out.print(i + " ");
                }

            }
        }
    }
}
