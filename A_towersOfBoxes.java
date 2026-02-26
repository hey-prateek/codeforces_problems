import java.util.Scanner;

public class A_towersOfBoxes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
                if (m > d) {
                    System.out.println(n);
                } else {
                    int c = Math.abs(d / m); // 2
                    int t = c + 1; // 3
                    int res = Math.abs(n / (Math.abs(d / m) + 1));
                    if (n % t == 0)
                        System.out.println(Math.abs(n / t));
                    else
                        System.out.println(Math.abs(n / t) + 1);
                }
            }
        }
    }
}
