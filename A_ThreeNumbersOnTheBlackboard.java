import java.util.Scanner;

public class A_ThreeNumbersOnTheBlackboard {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

                // first range as it is
                int main_range = Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));

                // all 3 ranges by doing ops on all 3 possibilities
                int tempa = b + c;
                int rangea = Math.max(tempa, Math.max(b, c)) - Math.min(tempa, Math.min(b, c));
                int tempb = a + c;
                int rangeb = Math.max(a, Math.max(tempb, c)) - Math.min(a, Math.min(tempb, c));
                int tempc = a + b;
                int rangec = Math.max(a, Math.max(b, tempc)) - Math.min(a, Math.min(b, tempc));

                System.out.println(Math.min(main_range, Math.min(rangea, Math.min(rangeb, rangec))));
            }
        }
    }
}
