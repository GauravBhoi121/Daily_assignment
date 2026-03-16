/*7. Find if Array Contains Pair with Given Difference
Idea: Sort array, use two pointers to find pair with difference k.
Example:
 arr = [1, 5, 3, 4, 2], k=2 → pair (1,3), (3,5)   */
import java.util.*;
public class ContainsPair
{
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            int a[]={1,5,3,4,2,6};
            int dif=2;
           for(int i=0;i<a.length;i++)
           {
               for(int j=0;j<a.length;j++)
               {
                  if(a[i]==(a[j]-dif))
                  {
                      System.out.println(a[i] +" " +a[j]);
                  }
               }
            }
       }
}
          