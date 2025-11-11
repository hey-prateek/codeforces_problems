import java.util.Scanner;

public class A_sequenceGame {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int tc=sc.nextInt();
            while(tc-->0)
            {
                int n=sc.nextInt();
                int[] arr=new int[n];
                for(int i=0; i<n; i++)
                {
                    arr[i]=sc.nextInt();
                }
                int x=sc.nextInt();

                boolean min=false, max=false;
                for(int i=0; i<n; i++)
                {
                    if(arr[i]<=x)
                    {
                        min=true;
                    }
                    if(arr[i]>=x)
                    {
                        max=true;
                    }
                }
                if(min && max)
                System.out.println("Yes");
                else
                System.out.println("No");
            }
        }
    }
}
