import java.util.Scanner;

public class A_square {
    public static void main(String[] args)
    {
         try (Scanner sc = new Scanner(System.in)) {
            int tc = sc.nextInt();
            while (tc-- > 0) {
                int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
                if(a==b && b==c && c==d)
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO");
                }
            }
    }
}
}
