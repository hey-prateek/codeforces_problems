import java.util.*;

public class B_rightMaximum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();

                int[][] arr = new int[n][2];
                for (int i = 0; i < n; i++) {
                    arr[i][0] = sc.nextInt();
                    arr[i][1] = i;
                }
                // Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));
                Arrays.sort(arr, (a, b) -> {
                    if (a[0] != b[0])
                        return b[0] - a[0]; // column 1 descending
                    return b[1] - a[1]; // column 2 descending
                });

                int in_rem = arr[0][1];
                int ops = 1;
                for (int i = 1; i < n; i++) {
                    if (arr[i][1] >= in_rem) {
                        continue;
                    } else {
                        in_rem = arr[i][1];
                        ops++;
                    }
                }

                System.out.println(ops);

                // List<Integer> lst = new ArrayList<>();
                // while (n-- > 0) {
                // lst.add(sc.nextInt());
                // }
                // int ops = 0;
                // while (!lst.isEmpty()) {
                // int max = Integer.MIN_VALUE;
                // int in = 0;
                // for (int i = 0; i < lst.size(); i++) {
                // if (lst.get(i) >= max) {
                // max = lst.get(i);
                // in = i;
                // }
                // }
                // lst.subList(in, lst.size()).clear();
                // ops++;
                // }
                // System.out.println(ops);
            }
        }
    }
}