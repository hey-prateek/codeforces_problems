import java.util.Scanner;

public class A_constructAnArray {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int val = n;
                for (int i = 0; i < n; i++) {
                    System.out.print(val++ + " ");
                }
                System.out.println();
            }
        }
    }
}