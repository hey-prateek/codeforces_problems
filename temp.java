import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temp {
    public static void  main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int tc=sc.nextInt();
            while(tc-- > 0)
            {
                int n=sc.nextInt(), temp, res=0;
                List<Integer> lst=new ArrayList();
                for(int i=0; i<n; i++)
                {
                    temp=sc.nextInt();
                    if(!lst.contains(temp))
                    {
                        lst.add(temp);
                        res++;
                    }
                }
                System.out.println(res);

                // can skip only on first encounter



            }
        }
    }
}
