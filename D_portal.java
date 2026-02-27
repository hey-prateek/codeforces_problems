import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D_portal {
    public static void main(String[] a) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        for (int t = Integer.parseInt(br.readLine()); t-- > 0;) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]), x = Integer.parseInt(s[1]), y = Integer.parseInt(s[2]);
            int[] p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < x; i++)
                list.add(p[i]);
            for (int i = y; i < n; i++)
                list.add(p[i]);
            Collections.sort(list);

            int k = 0;
            for (int i = 0; i < x; i++)
                p[i] = list.get(k++);
            for (int i = y; i < n; i++)
                p[i] = list.get(k++);

            for (int v : p)
                out.append(v).append(" ");
            out.append("\n");
        }
        System.out.print(out);
    }
}
