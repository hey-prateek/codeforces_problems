import java.util.*;

public class B_digitString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int t = sc.nextInt(); t-- > 0;) {

            String s = sc.next();

            int n = s.length(), oneThree = 0;

            for (char c : s.toCharArray())
                if (c == '1' || c == '3')
                    oneThree++;

            int ans = n - oneThree, left2 = 0, right13 = oneThree;

            for (char c : s.toCharArray()) {

                if (c == '1' || c == '3')
                    right13--;

                if (c == '2')
                    left2++;

                ans = Math.min(ans, n - (left2 + right13));
            }

            System.out.println(ans);
        }
    }
}