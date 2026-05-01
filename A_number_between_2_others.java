import java.util.Scanner;

public class A_number_between_2_others {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                long x = sc.nextLong(), y = sc.nextLong();
                long temp = x;
                boolean flag = false;
                while (temp < y) {
                    if (y % (y - temp) != 0 && (y - temp) % x == 0) {
                        flag = true;
                        break;
                    }
                    temp += x;
                }
                System.out.println(flag ? "YES" : "NO");
            }
        }
    }
}