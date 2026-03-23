/*  17. Find Minimum Difference Pair
Idea: Sort array and use two pointers to find minimum difference between pairs.
Example:
 arr = [1, 3, 4, 8, 13, 17, 20] → min diff = 1 (between 3 and 4)   */
import java.util.*;
public class MinDifferenceApp
{
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            int a[]={1,3,4,8,13,17,20};
            Arrays.sort(a);
            
            int Min=a[1]-a[0];
            for(int i=0;i<a.length-1;i++)
            {
               if(a[i+1]-a[i]<Min)
               {
                   Min=a[i+1]-a[i];
               }
            }

           System.out.println(Min);
       }
}