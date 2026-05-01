import java.util.Scanner;

public class A_koshary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int x = sc.nextInt(), y = sc.nextInt();
                System.out.println((x % 2 != 0 && y % 2 != 0) ? "NO" : "YES");
            }
        }
    }
}
