/*  18. Sort Array by Parity (Even followed by Odd)
Idea: Use two pointers, one from start and one from end, swap to bring evens forward.
Example:
 arr = [3, 1, 2, 4] → sorted by parity → [2, 4, 3, 1]   */
import java.util.*;
public class SortPairity
{
      public static void main(String args[])
      {                                                       
          Scanner sc=new Scanner(System.in);
          int a[]={1,1,1,2,2,2};
    
          int start=0;
          int end=a.length-1;
           for(int i=0;i<a.length-1;i++)
           {
                if(a[start]%2==0)
                {
                    start++;   
                } 
                else if(a[start]%2==1)
                {
                    while(a[end]%2==1)
                    {
                        end--;
                    }
                  if(a[end]%2==0)
                  {
                    int temp=a[end];
                    a[end]=a[start];
                    a[start]=temp;
                    
                  }  
                }    
           } 
           for(int i=0;i<a.length;i++)
               System.out.println(a[i]);
       }
}