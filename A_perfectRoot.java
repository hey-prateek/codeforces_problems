import java.util.Scanner;

public class A_perfectRoot {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int tc = sc.nextInt();
            while(tc-- > 0)
            {
                int n=sc.nextInt();
                for(int i=1; i<=n; i++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
