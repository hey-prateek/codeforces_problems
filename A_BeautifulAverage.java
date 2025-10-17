import java.util.Scanner;

public class A_BeautifulAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), temp;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    temp = sc.nextInt();
                    if (temp > max)
                        max = temp;
                }
                System.out.println(max);

            }
        }
    }
}
