import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class C_shiftedMEX {
     public static void main(String[] args)
    {
        try(Scanner sc=new Scanner(System.in))
        {
            int tc = sc.nextInt();
            while(tc-- > 0)
            {
                int n=sc.nextInt();
                //order ka game hai
                //get longest consecutive order in an array elements
                SortedSet<Integer> sset = new TreeSet<>();
                for(int i=0; i<n; i++)
                {
                    sset.add(sc.nextInt());
                }
                List<Integer> list = new ArrayList<>(sset);
                // System.out.println(list);
                int max=0, leng=0;
                for(int i=0; i<list.size()-1; i++)
                {
                    if(Math.abs(list.get(i)-list.get(i+1))==1)
                    {
                        leng++;
                    }
                    else
                    {
                        max=Math.max(max, leng);
                        leng=0;
                    }
                }
                max=Math.max(max, leng)+1;
                System.out.println(max);
            }
        }
    }
}
