/*22. Check if Array is Sorted (Ascending or Descending)
Concept: Compare each element with the next and verify order.
 Use Case: Check data integrity or sort status.
Input: arr = [10, 20, 30, 40, 50]
Output: Array is sorted in ascending order.  */
import java.util.*;
public class CheakArray
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          int a[]={1,2,3,4,5,4,3,2,1}; 
          int acount=0;
          int dcount=0;
          for(int i=0;i<a.length-1;i++)
          {
             if(a[i]<a[i+1])
             {
                acount++;
             }
             if(a[i]>a[i+1])
             {
               dcount++;
             }
          }
          if(acount==a.length-1)
          {
                  System.out.println("ascending");
          }
          else if(dcount==a.length-1)
          {
                System.out.println("Dscending");
          }
          else
          {
             System.out.println("not sorted array");
          }              
      }
}