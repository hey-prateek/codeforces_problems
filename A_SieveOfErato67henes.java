import java.util.Scanner;

public class A_SieveOfErato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {

            int n = sc.nextInt();

            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 67) {
                    flag = true;
                }
            }
            System.out.println(flag ? "yes" : "no");
        }

    }
}
