import java.util.Scanner;

public class A_ShizukuHoshikawaAndFarmLegs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                if (n % 2 == 1) {
                    System.out.println(0);
                } else if (n < 4)
                    System.out.println(1);
                else {
                    // floor of n by 4 +1
                    System.out.println((int) Math.floor(n / 4) + 1);
                }
            }
        }
    }
}

//start with 1 cow, then 2, then so on...