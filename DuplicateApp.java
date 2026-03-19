/*3. Remove Duplicates from Sorted Array
Idea: Use two pointers; one to iterate, the other to mark the position of unique elements.
Example:
 arr = [1, 1, 2, 3, 3] → after removal → [1, 2, 3] */
import java.util.*;
public class DuplicateApp
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a[]={1,1,2,3,3};
         for(int i=0;i<a.length-1;i++)
         {
             if(a[i]==a[i+1])
             {
                a[i+1]=-1;
             }
             if(a[i]!=-1)
               System.out.println(a[i]);
         }
      }
 }