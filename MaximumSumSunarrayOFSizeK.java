/*  Sliding window program 
1. Maximum Sum Subarray of Size K
Example:
 Input: arr = [2, 1, 5, 1, 3, 2], K=3
 Output: 9 (subarray [5, 1, 3])        */
import java.util.*;
public class MaximumSumSunarrayOFSizeK
{
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            int a[]={2,3,4,3,4,3,2,12,1,5,1,3,2,0,0,0,0,12,10,13};
            int value=3;
            int Max=0;
            for(int i=0;i<a.length-(value-1);i++)
            {
               /* 
                System.out.println("sum = "+a[i]+a[i+1]+a[i+2]);
                    if(a[i]+a[i+1]+a[i+2]>Max)
                    {
                       Max=a[i]+a[i+1]+a[i+2];
                    }
                         */
              int sum=0;
               for(int j=i+1;j<(value+i);j++)
               {
                   
                    sum+=a[j];
                    //System.out.print(a[i]+"sum ="+a[j]);
               } 
                sum+=a[i];
                 //System.out.println("\tsum = "+sum);
                   if(sum>Max)
                    {
                       Max=sum;
                    }
            }
            System.out.println(Max);
        }
}
