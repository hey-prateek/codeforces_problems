import java.util.Scanner;

public class B_nikitaAndBooks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                long prev = 0;
                boolean flag = true;

                long[] arr = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextLong();
                }

                for (int i = 0; i < n; i++) {
                    long in = i + 1;
                    long inp = arr[i];
                    inp += prev;
                    if (inp < in) {
                        flag = false;
                        break;
                    } else {
                        prev = inp - in;
                    }
                }
                System.out.println(flag ? "yes" : "no");
            }
        }
    }

}
