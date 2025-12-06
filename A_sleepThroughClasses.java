import java.util.Scanner;

public class A_sleepThroughClasses {
    public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int tc=sc.nextInt();
            while(tc-->0)
            {
                int n=sc.nextInt(), k=sc.nextInt();
                sc.nextLine();
                String s=sc.nextLine();
                int act=0, sleep=0;
                for(int i=0; i<n; i++)
                {
                    if(s.charAt(i)=='1')
                    {
                        act=k;
                    }
                    else
                    {
                        if(act--<=0)
                            sleep++;
                    }
                }
                System.out.println(sleep);
            }
        }
    }
}
