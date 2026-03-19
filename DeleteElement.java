/*21. Delete an Element from a Specific Position
Concept: Shift elements to the left to overwrite the removed value.
 Use Case: Remove items from a list, logs, etc.
Input: arr = [10, 20, 30, 40, 50]
Size = 5
Array after deletion: [10, 20, 40, 50] */
import java.util.*;
public class DeleteElement
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a[]={1,2,3,4,5};
         int size=5;
         int value=sc.nextInt();
         for(int i=0;i<a.length;i++)
         {
            if(a[i]==value)
            {
               i++;
            }
            System.out.println(a[i]);
        }
     }
}