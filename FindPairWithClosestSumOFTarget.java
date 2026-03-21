/* 20. Find Pair with Closest Sum to Target
Idea: Use two pointers from both ends to find pair with sum closest to target.
Example:
 arr = [10, 22, 28, 29, 30, 40], target=54 → closest pair (22, 30)    */
import java.util.*;
public class FindPairWithClosestSumOFTarget
{
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           int a[]={10,22,28,29,30,40};
          
            int Max=0;
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        a[i]=-1;
                    }
                    if(a[i]+a[j]<=54 && a[i]+a[j]>Max ){
                        System.out.print("\t"+(a[i]+a[j]));
                        Max=a[i]+a[j];    }
                }
            }
             System.out.println(" "+Max);
       }
}