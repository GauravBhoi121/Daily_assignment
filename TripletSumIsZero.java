/* 12. Find Triplets with Zero Sum
Idea: Fix one pointer, then use two pointers for remaining array to find pairs summing to -arr[i].
Example:
 arr = [-1, 0, 1, 2, -1, -4] → triplets: (-1, -1, 2), (-1, 0, 1)  */
import java.util.*;
public class TripletSumIsZero
{
       public static void main(String args[])
       {
             Scanner sc=new Scanner(System.in);
            int a[]={-1,0,1,2,-1,4};
            
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    for(int k=j+1;k<a.length;k++)
                    {
                        if((a[i]+a[j]+a[k])==0)
                           System.out.println("{ "+a[i]+", "+a[j]+", "+a[k]+" }");
                    }
                }
            }
         }
 }