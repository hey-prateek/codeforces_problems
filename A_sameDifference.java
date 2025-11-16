import java.util.Scanner;

public class A_sameDifference {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt(), count = 0;
                sc.nextLine();
                String s = sc.nextLine();

                for (int i = s.length() - 1; i >= 0; i--) {
                    if (s.charAt(n - 1) != (s.charAt(i)))
                        count++;
                }
                System.out.println(count);
            }
        }
    }
}
