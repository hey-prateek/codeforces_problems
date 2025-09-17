import java.util.Scanner;

public class sublimeSequence {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0)
        {
            int x=sc.nextInt(), n=sc.nextInt();
            System.out.println(n%2==0 ? 0 : x);
        }
        sc.close();
    }
    
}
