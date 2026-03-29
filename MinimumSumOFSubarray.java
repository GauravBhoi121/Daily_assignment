/*  2. Minimum Sum Subarray of Size K
Example:
 Input: arr = [2, 1, 5, 1, 3, 2], K=3
 Output: 4 (subarray [1, 3, 2])     */
import java.util.*;
public class MinimumSumOFSubarray
{
         public static void main(String args[])
         {
             Scanner sc=new Scanner(System.in);
             int a[]={2,1,5,1,3,2,2,3,4,5,0,0,5,55};
       
           int Min=Integer.MAX_VALUE;
            int value=3;
           for(int i=0;i<a.length-(value-1);i++)
           {
                 int sum=0;
                 for(int j=i+1;j<i+(value);j++)
                 {
                     sum+=a[j];
                    
                 }
                sum+=a[i];
                if(sum<Min)
                {
                   Min=sum;
                }
           }
          System.out.println(Min);
       }
}  