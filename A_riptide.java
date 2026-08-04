import java.util.Scanner;

public class A_riptide {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
                System.out.println(Math.min(Math.abs(a - b), Math.min(Math.abs(b - c), Math.abs(a - c))));
            }
        }
    }
}
