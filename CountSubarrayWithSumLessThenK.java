/*  6. Count Subarrays with Sum Less than K
Example:
 Input: arr = [2, 5, 6], K=10
 Output: 4 ([2], [5], [6], [2,5])  */
import java.util.*;
public class CountSubarrayWithSumLessThenK
{
       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           int a[]={2,5,6};
           int value=10;
           int count=0;
           for(int i=0;i<a.length;i++)
           {
             for(int j=i; j<a.length; j++)
              if(a[i]<=10)
              {
                   count++;
                // System.out.println(a[i]);
              }                            
           }
           System.out.println(" count = "+count);
       }
}   