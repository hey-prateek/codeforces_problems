import java.util.Arrays;
import java.util.Scanner;

public class A_blocked {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int[] res = new int[101];
                boolean flag = true;
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if (res[arr[i]] != 0) {
                        flag = false;
                    } else
                        res[arr[i]] = 1;
                }
                if (flag == false)
                    System.out.println(-1);
                else {
                    Arrays.sort(arr); // ascending
                    for (int i = 0; i < arr.length / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[arr.length - 1 - i];
                        arr[arr.length - 1 - i] = temp;
                    }
                    for (int i : arr)
                        System.out.print(i + " ");
                    System.out.println();
                    // System.out.println(Arrays.toString(arr)); // [9, 5, 2, 1]

                }
            }
        }
    }
}
