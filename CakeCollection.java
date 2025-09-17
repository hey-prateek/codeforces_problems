import java.util.Arrays;
import java.util.Scanner;

public class cakeCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0)
        {
            int n=sc.nextInt(), m=sc.nextInt(), res=0;
            int[] arr=new int[n];

            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }

            if(n==1)
            {
                System.out.println(m*arr[0]);
            }
            else
            {
                Arrays.sort(arr);
                if(m==n)
                {
                    for(int i=1; i<=m; i++)
                    {
                        res+=arr[i-1]*i;
                    }
                }
                else if(n>m)
                {
                    for(int i=m, j=n-1; i>0; i--, j--)
                    {
                        res+=arr[j]*i;
                    }
                }
                else
                {
                    for(int i=n-1, j=m; i>=1; i--, j--)
                    {
                        res+=arr[i]*j;
                    }
                    res+=(arr[0]*(m-n+1));

                }
                System.out.println(res);
            }
        }
        sc.close();
    }
}

// n array elemets, m total seconds
// a1, a2, a3, a4,....
// step 1: sort array
// step 2: if n=1, return n*m
// m=n -> a0*1 + a1*2 + a2*3 +...upto m or n
// m<n -> come from last -> an*m + a(n-1)*(m-1) + a(n-2)*(m-2) + ....upto m
// m>n -> a[n]*m + a[n-1]*(m-1) + a[n-2]*(m-2) + ....upto n-1 times, leaving first element
// remaining seconds = m-n, now arr[0]*(m-n), add it to final result

// n=3, m=4
// m>n, 1 2 3
// 3*4 + 2*3 + 1*2 =20