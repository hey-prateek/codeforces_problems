import java.util.Scanner;

public class A_BePositive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-- >0)
        {
            int n=sc.nextInt(), minus=0, zeros=0, temp;
            for(int i=0; i<n; i++)
            {
                temp=sc.nextInt();
                if(temp==-1)
                {
                    minus++;
                }
                else if(temp==0)
                {
                    zeros++;
                }
            }
            if(minus%2!=0)
            {
                zeros+=2;
            }
            System.out.println(zeros);
        }
        sc.close();
        
    }
}