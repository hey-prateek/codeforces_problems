import java.util.Scanner;

public class A_simonsAndMakingItBeautiful {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int pos = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (arr[i] == n)
                        pos = i;
                }
                if (pos == 0) {
                    for (int i : arr)
                        System.out.print(i + " ");
                } else {
                    int temp = arr[pos];
                    arr[pos] = arr[0];
                    arr[0] = temp;
                    for (int i : arr)
                        System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
