/*  4. Count Distinct Elements in Every Window of Size K
Example:
 Input: arr = [1, 2, 1, 3, 4, 2, 3], K=4
 Output: [3, 4, 4, 3]   */
import java.util.*;
public class CountDistanceOFElementEveryWindowsSizeK
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          int a[]={1,2,1,3,4,2,3};
          
          int value=4;
          int sum=0; 
          for(int i=0;i<a.length-(value-1);i++)
          {
             int Min=Integer.MAX_VALUE;
             int Max=Integer.MIN_VALUE;
             
             for(int j=i+1;j<i+(value);j++)
             {
                 System.out.println("\t"+a[j]);
                 if(a[j]<Min)
                 {
                   Min=a[j];
                 }
                 if(a[j]>Max)
                 {
                    Max=a[j];
                 }
             }
                 if(a[i]<Min)
                 {
                   Min=a[i];
                 }
                 if(a[i]>Max)
                 {
                    Max=a[i];
                 }
             sum=Max-Min;
             System.out.println(sum+1);
         }
    }
}