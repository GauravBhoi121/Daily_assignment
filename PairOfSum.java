/* 4. Pair Sum in Sorted Array
Idea: One pointer at start, one at end; move pointers inward based on sum compared to target.
Example:
 arr = [1, 2, 3, 4, 6], target = 6 → pairs: (2, 4)  */
import java.util.*;
public class PairOfSum
{
      public static void main(String args[])
      {
            int a[]={1,2,3,4,5};
            for(int i=0;i<a.length;i++)
            {
               for(int j=i+1;j<a.length;j++)
               {
                  if(a[i]+a[j]==6)
                  {
                      System.out.println(a[i]+" "+a[j]);
                  }
               }
           }
       }
}