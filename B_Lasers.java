import java.util.Scanner;

public class B_Lasers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0)
        {
            int n=sc.nextInt(), m=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
            int[] an=new int[n];
            int[] bm=new int[m];
            for(int i=0; i<n; i++)
            {
                an[i]=sc.nextInt();
            }
            for(int i=0; i<m; i++)
            {
                bm[i]=sc.nextInt();
            }

            System.out.println(n+m);
        }
        sc.close();
    }
}