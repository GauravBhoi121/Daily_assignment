/*16. Check If Two Arrays Are Permutations
Idea: Sort both arrays and use two pointers to check equality.
Example:
 arr1 = [1, 2, 3], arr2 = [3, 2, 1] → permutation → True */
import java.util.*;
public class PermutationsApp
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
 
           int a[]={1,2,3};
           int b[]={3,2,1};
         int count=0;
         if(a.length==b.length)
           for(int i=0;i<a.length;i++)
           {
              for(int j=0;j<b.length;j++)
              {
                 if(a[i]==b[j])
                 {
                    a[j]=-1;
                    count++;
                    break;
                 }
             }
          }
          System.out.println(count);
       }
}