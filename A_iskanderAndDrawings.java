import java.util.Scanner;

public class A_iskanderAndDrawings {
    public static void main(String[] args1) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                int max_count = 0, temp = 0;
                String s = sc.next();
                for (char c : s.toCharArray()) {
                    if (c == '#') {
                        temp++;
                    } else {
                        max_count = Math.max(max_count, temp);
                        temp = 0;
                    }
                }
                max_count = Math.max(max_count, temp);
                System.out.println((int) Math.ceil(max_count / 2.0));
            }
        }
    }
}
