
import java.util.Scanner;

public class A_passingTheBall {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                sc.nextLine();
                int res = 0;
                String s = sc.nextLine();
                for (char c : s.toCharArray()) {
                    if (c == 'L') {
                        res++;
                        break;
                    } else
                        res++;
                }

                System.out.println(res);
            }
        }
    }
}
