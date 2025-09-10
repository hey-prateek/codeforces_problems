import java.util.*;
import java.lang.*;
import java.io.*;

class ChefPass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-- >0)
		{
		    int n=sc.nextInt(), cutoff=0, temp=0, passed=1;
		    for(int i=0; i<n; i++)
		    {
		        temp=sc.nextInt();
		        if(i==0)
		        {
		            cutoff=temp;
		        }
		        if(temp>=cutoff)
		        {
		            passed++;
		        }
		    }
		    System.out.print(passed-1);
            sc.nextLine();
		}

	}
}
