import java.util.Scanner;

public class A_aNumberBetweenTwoOthers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                long x = sc.nextLong(), y = sc.nextLong();
                // y mod x = 0
                // find z in between x and y, such that "z mod x = 0" and "y mod z != 0"
                boolean flag = false;
                for (long i = x + 1; i <= y; i++) {
                    if (i % x == 0 && y % i != 0) {
                        System.out.println("YES");
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    System.out.println("NO");
            }
        }
    }
}