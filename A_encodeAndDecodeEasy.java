import java.util.*;

public class A_encodeAndDecodeEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.nextLine();

        if (mode.equalsIgnoreCase("first")) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            // Encode numbers 1–26 into letters 'a'–'z'
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append((char) ('a' + arr[i] - 1));
            }
            System.out.println(sb);
        }

        else if (mode.equalsIgnoreCase("second")) {
            String s = sc.nextLine();

            // Decode letters 'a'–'z' back to numbers 1–26
            int n = s.length();
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                System.out.print((s.charAt(i) - 'a' + 1));
                if (i != n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
