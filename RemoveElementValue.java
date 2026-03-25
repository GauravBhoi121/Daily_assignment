/*  9. Remove Element (Given Value) from Array
Idea: Two pointers: one to read, one to write elements not equal to target.
Example:
 arr = [3, 2, 2, 3], val = 3 → result length = 2, arr = [2, 2]   */
import java.util.*;
public class RemoveElementValue
{
        public static void main(String args[])
        {
               Scanner sc=new Scanner(System.in);
               int a[]={3,2,2,3};
               int count=0;
               for(int i=0;i<a.length-1;i++)
               {
                  if(a[i]==3)
                  {
                    i++;
                    count++;
                  }
                  System.out.println(a[i]);
              }
              if(a[a.length-1]==3)count++;
              System.out.println(count);
        }
}