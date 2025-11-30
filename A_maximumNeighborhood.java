import java.util.Scanner;

public class A_maximumNeighborhood {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                if (n == 1)
                    System.out.println(1);
                else if (n == 2)
                    System.out.println(9);
                else if (n < 5) {
                    int nsq = n * n;
                    int res = nsq + nsq - 1 + nsq - 2 + nsq - 1 - n;
                    System.out.println(res);
                } else {
                    int res = (n * n) - n - 1;
                    System.out.println(res * 5);
                }
            }
        }
    }
}
