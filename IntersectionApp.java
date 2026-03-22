/*  10. Intersection of Two Sorted Arrays
Idea: Two pointers iterate both arrays to find common elements.
Example:
 arr1 = [1, 2, 4], arr2 = [2, 4, 6] → intersection: [2, 4]   */    1 2 2  123
import java.util.*;
public class IntersectionApp
{
     public static void main(String args[])
     {
           Scanner sc=new Scanner(System.in);
           int a[]={1,2,4};
           int b[]={2,4,6};
           for(int i=0;i<a.length;i++)
           {
              int flag=0;
              for(int j=0;j<b.length;j++)
              {
                 if(a[i]==b[j])
                 {
                     flag=1;
                 }
              }
              if(flag==1)
              {
                 System.out.println(a[i]);
              }
          }
      }
}