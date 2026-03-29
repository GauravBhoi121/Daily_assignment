/* 15. Find Pair with Given Sum in Unsorted Array
Idea: Sort array, then use two pointers.
Example:
 arr = [8, 7, 2, 5, 3, 1], target=10 → pairs: (8,2), (7,3)  */
import java.util.*;
public class PairOfgivanSum
{
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           int a[]={8,7,2,5,3,1};
   
          int first=0;
          int last=a.length-1;
          
          while(first<last)
          {
             int first2=first+1;
             while(first2<last)
             {
                if(a[first]+a[first2]==10)
                {
                   System.out.println(a[first]+" "+a[first2]);
                }
                first2++;
             }
          first++;
         }
      }
}
                   