import java.util.Scanner;

public class A_bigrams {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int k = sc.nextInt();
                int count3 = 0, count2 = 0, temp;
                for (int i = 0; i < k; i++) {
                    temp = sc.nextInt();
                    if (temp == 2)
                        count2++;
                    else if (temp >= 3)
                        count3++;
                }
                System.out.println(count2 >= 2 || count3 > 0 ? "yes" : "no");
            }
        }
    }
}