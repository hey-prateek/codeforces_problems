import java.util.Scanner;

public class B_prefixMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int max = 0, temp = 0;
                for (int i = 0; i < n; i++) {
                    temp = sc.nextInt();
                    max = Math.max(max, temp);
                }
                System.out.println(max * n);
            }
        }
    }
}
