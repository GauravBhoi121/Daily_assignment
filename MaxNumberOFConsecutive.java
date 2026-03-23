/* 7. Maximum Number of Consecutive Ones
Example:
 Input: arr = [1, 1, 0, 1, 1, 1], K=0 (no flips)
 Output: 3 (subarray [1,1,1])   */
import java.util.*;
public class MaxNumberOFConsecutive
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int a[]={0,0,0,0,0,00,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,9,0,9,0,9,0,99,9,9,9,9,9,9,99,9,9,99,9};
        
        int k=0;
       
         int Max=Integer.MIN_VALUE;
         
         
         for(int i=0;i<a.length;)
         {
             int temp=0;
             int count=1;
            for(int j=i;j<a.length;j++)
            {    
                
                //System.out.print("  "+a[j]);
                 if(a[j]==0)
                 {
                    temp++;
                    break;
                 }
                 else
                 {
                      count++;
                 }
            }
           // System.out.println("count   "+(count-temp));
            
            if((count-temp)>Max)
            {
                Max=(count-temp);
            }
            i+=count;
            
        }
        System.out.println(Max-1);
    }
}