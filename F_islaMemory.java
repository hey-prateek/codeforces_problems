import java.io.*;
import java.util.*;

public class F_islaMemory {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            long[] a = new long[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) a[i] = Long.parseLong(st.nextToken());

            long[] pref = new long[n + 1];
            for (int i = 1; i <= n; i++) pref[i] = pref[i - 1] + a[i];

            while (q-- > 0) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                long x = Long.parseLong(st.nextToken());

                // Find hi = last index where a[hi] >= x
                int lo = 1, hi = n, res = 0;
                while (lo <= hi) {
                    int mid = (lo + hi) >>> 1;
                    if (a[mid] >= x) {
                        res = mid;
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
                int lastGE = res;   // last index with a[i] >= x

                long cnt = 0;
                long sumFinal = 0;

                if (lastGE < l) {
                    // Case A: whole [l..r] has all a[i] < x
                    long total = pref[r] - pref[l - 1];
                    cnt = total / x;
                    sumFinal = total % x;
                } else {
                    // Case B: prefix part [l .. min(r, lastGE)] all >= x
                    int end1 = Math.min(r, lastGE);
                    cnt += (end1 - l + 1);  // each induces immediate reset

                    if (end1 < r) {
                        // process remaining block [end1+1 .. r], all < x
                        long total = pref[r] - pref[end1];
                        cnt += total / x;
                        sumFinal = total % x;
                    } else {
                        sumFinal = 0; // ended inside the >=x zone
                    }
                }

                out.append(cnt).append(' ').append(sumFinal).append('\n');
            }
        }

        System.out.print(out);
    }
}
