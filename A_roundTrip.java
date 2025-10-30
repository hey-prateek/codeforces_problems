import java.util.Scanner;

public class A_roundTrip {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int r = sc.nextInt(), x = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                int count_rounds = 0;

                // for each round
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == '1') {
                        count_rounds++;
                        r = r - d;
                        if (r < 0) {
                            r = 0;
                        }
                    } else {
                        if (r < x) {
                            count_rounds++;
                            r = r - d;
                            if (r < 0) {
                                r = 0;
                            }
                        }
                    }
                }
                System.out.println(count_rounds);
            }
        }
    }
}