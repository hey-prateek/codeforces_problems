import java.util.Scanner;

public class A_divisiblePermutation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int tc = sc.nextInt();
            while (tc-- > 0) {

                int n = sc.nextInt();
                int[] arr = new int[n];
                int l = 1, r = n;
                boolean flag = true;
                for (int i = n - 1; i >= 0; i--) {
                    if (flag) {
                        arr[i] = l++;
                        flag = false;
                    } else {
                        arr[i] = r--;
                        flag = true;
                    }
                }

                for (int i : arr)
                    System.out.print(i + " ");
            }
        }
    }
}