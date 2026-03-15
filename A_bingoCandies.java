import java.util.*;

public class A_bingoCandies {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int n = sc.nextInt();
                Map<Integer, Integer> hmap = new HashMap<>();
                int temp;
                boolean flag = true;
                for (int i = 0; i < n * n; i++) {
                    temp = sc.nextInt();
                    hmap.put(temp, hmap.getOrDefault(temp, 0) + 1);
                    if (flag && hmap.get(temp) > ((n * n) - n)) {
                        System.out.println("no");
                        flag = false;
                    }

                }
                if (flag)
                    System.out.println("yes");

            }
        }
    }
}
