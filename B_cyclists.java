import java.util.*;

public class B_cyclists {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {

                int n = sc.nextInt(), k = sc.nextInt(), p = sc.nextInt(), m = sc.nextInt();
                List<Integer> lst = new ArrayList<>();

                int wincost = 0;
                for (int i = 0; i < n; i++) {
                    lst.add(sc.nextInt());
                    if (i + 1 == p) // to get ccost of winning card
                        wincost = lst.get(i);
                }
                if (n == k) {
                    System.out.println((int) m / lst.get(p - 1));
                } else {
                    int moves = 0;
                    while (m >= wincost) {
                        // check if winning card is in range 1 to k
                        // if yes ->
                        // remove and place winning card at end, reduce m by cost, increment moves, p
                        // changes to lst.size()-1
                        // else
                        // find min from 0 to k-1, place min at last, m reduces by cost, p--

                        if (p - 1 < k) // means we can remove winning card
                        {
                            moves++;
                            lst.add(lst.get(p - 1));
                            m -= lst.get(p - 1);
                            lst.remove(p - 1);
                            p = lst.size();
                        } else {
                            Collections.sort(lst.subList(0, k));
                            lst.add(lst.get(0));
                            m -= lst.get(0);
                            p--;
                            lst.remove(0);
                        }
                    }
                    System.out.println(moves);
                }
            }
        }
    }
}