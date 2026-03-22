/*  5. Longest Subarray with Sum K (positive numbers)
Example:
 Input: arr = [4, 1,1,1,1,1, 2, 3, 5], K=5
 Output: 4 (subarray [1,1,1,2])    */
import java.util.*;
public class LongestSubarrayWithSumKPositiveNumbers
{
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              int a[]={3,2,1,0,0,0,0,0,0,2,2,3,50};
              int sum=5,start=0,end=0;
              int Max=Integer.MIN_VALUE;
              for(int i=0;i<a.length;i++)
              { 
                 int value=0;
                 int count=0;
                 for(int j=i;j<a.length;j++)
                 {    value+=a[j];
                     if(sum==value)
                     { 
                       if((j-i+1)>Max)
                       {   start = i; end=j;
                          Max=j-i+1;
                       }
                       break;
                     }
                 
                 }
               }
                System.out.println("The Longest SumArray sumOF count is = "+Max);
		for(int i=start;i<=end; i++)
                 {  System.out.print("  "+a[i]);  }
         }
}