import java.io.*;
import java.util.*;

public class B_nikoTacticalCard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            long[] b = new long[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Long.parseLong(st.nextToken());

            long maxV = 0L; // maximum possible score after i turns
            long minV = 0L; // minimum possible score after i turns

            for (int i = 0; i < n; i++) {
                long newMax = Math.max(maxV - a[i], b[i] - minV);
                long newMin = Math.min(minV - a[i], b[i] - maxV);
                maxV = newMax;
                minV = newMin;
            }

            out.append(maxV).append('\n');
        }
        System.out.print(out);
    }
}
