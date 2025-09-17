import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class allLengthsSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> alist = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                alist.add(sc.nextInt());
            }

            int max = n;
            List<Integer> lst = new ArrayList<>();
            lst.add(alist.indexOf(max));

            max--;
            int flag = 0;
            while (max > 0) {
                int test = alist.indexOf(max);
                // System.out.println("max = "+max);
                if (!(lst.contains(1 + test) || lst.contains(test - 1))) {
                    flag = 1;
                    break;
                }
                lst.add(test);
                max--;
            }
            // System.out.println(lst);

            if (flag == 0)
                System.out.println("yes");
            else
                System.out.println("no");

        }
        sc.close();
    }
}
