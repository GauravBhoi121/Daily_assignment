/*8. Check if Two Arrays Have Pair with Given Sum
Idea: Sort one array, use two pointers (one for each array) to find sum.
Example:
 arr1 = [1, 2, 4], arr2 = [2, 3, 6], target = 6 → pair (4, 2)     */
import java.util.*;
public class TwoArraysSumPair
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int a[]={1,2,4}; 
            int b[]={2,3,6};
     
            for(int i=0;i<a.length;i++)
            {
               for(int j=0;j<b.length;j++)
               {
                  if(a[i]+a[j]==6)
                  {
                      System.out.println(a[i]+" "+a[j]);
                  }
               }
            }
         }
}