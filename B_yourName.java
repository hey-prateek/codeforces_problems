import java.util.*;

public class B_yourName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine()); // safer than nextInt()

        while (tc-- > 0) {
            int n = Integer.parseInt(sc.nextLine()); // read as full line
            String str1 = sc.nextLine().trim();
            String str2 = sc.nextLine().trim();

            if (str1.length() != str2.length()) {
                System.out.println("no");
                continue;
            }

            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[str1.charAt(i) - 'a']++;
                freq[str2.charAt(i) - 'a']--;
            }

            boolean isAnagram = true;
            for (int val : freq) {
                if (val != 0) {
                    isAnagram = false;
                    break;
                }
            }
            System.out.println(isAnagram ? "yes" : "no");
        }
        sc.close();
    }
}
