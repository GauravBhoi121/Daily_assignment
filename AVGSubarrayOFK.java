/* 3. Average of All Subarrays of Size K
Example:
 Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 Output: [2.2, 2.8, 2.4, 3.6, 2.8]        */
import java.util.*;
public class AVGSubarrayOFK
{
       public static void main(String args[])
       {
           Scanner Sc=new Scanner(System.in);
           int a[]={1,3,2,6,-1,4,1,8,2,1,2,3,5,6,7,}; 
       
           
           int value=7;
           for(int i=0;i<a.length-(value-1);i++)
           {
              float avg=0;
              for(int j=i+1;j<(i+value);j++)
              {
                     avg+=a[j];
                    //System.out.print("\t"+a[j]+a[i]);
              }
              System.out.println("\t");
              avg=(avg+a[i])/value;
              System.out.print((i+1)+"\t"+avg);
           }
      }
}
              