import java.util.Scanner;

public class A_optimalPurchase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
                System.out.println(Math.min(a * b, (a / 3) * c + Math.min((int) ((a % 3) * b), c)));
            }
        }
    }

}
