/*  14. Partition Array Around a Pivot
Idea: Rearrange array so that elements smaller than pivot are on left, greater on right using two pointers.
Example:
arr = [9, 12, 3, 5, 14, 10, 10], pivot = 10 → partitioned: [9, 3, 5, 10, 14, 12, 10]   */
import java.util.*;
public class PartitionArray
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
        
          int a[]={0,0,0,1,0,0,0,0,21,0,0,89,3,12};
          
         int left=0;
         int right=a.length-1;
         int value=0;

       for(int i=0;i<a.length;i++)
       {
          if(a[left]>value)
          {
              if(a[right]<=value)
              {
                 int temp=a[left];          
                 a[left]=a[right];
                 a[right]=temp;
                   right--;
              }
              else if(a[right]>value)
              {
                  right--;
                  left--;
              }
          }
         
       }
      for(int i=0;i<a.length-1;i++)
       {
            if(a[i]>value && a[i+1]<=value) 
            {
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
            }
       }  
        for(int i=0;i<a.length-1;i++)
       {
            if(a[i]>value && a[i+1]<=value) 
            {
               int temp=a[i];
               a[i]=a[i+1];
               a[i+1]=temp;
            }
       }  
       for(int i=a.length-1;i>=0;i--)
       {
          System.out.println(a[i]);
       }
    }
}