/*Check if Array is Palindrome
Idea: Compare elements at two pointers from start and end, move inward, check if all pairs match.
Example:
 arr = [1, 2, 3, 2, 1] → palindrome
 arr = [1, 2, 3, 4, 5] → not palindrome */
import java.util.*;
public class PalidromeArray
{
      public static void main(String args[])
      {
         Scanner cs=new Scanner(System.in);
         int a[]={1,2,4,2,2,1};
         int Last=a.length-1;
         int count=0;
         for(int i=0;i<a.length;i++)
         {
            if(a[i]==a[Last])
            {
              count++;
            }
            Last--;
         }
         if(count==a.length)
            System.out.println("is");
         else
            System.out.println("is not");
     }
}