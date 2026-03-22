/*20. Insert an Element at a Specific Position
Concept: Shift elements from the target index to the right and place the new value.
 Use Case: Insert student records, product, etc.
Input: arr = [10, 20, 30, 40, 50]   */
import java.util.*;
public class InsertElement 
{
       public static void main(String args[])
       {
          Scanner sc=new Scanner(System.in);
            int a[]=new int[6];
            for(int i=0;i<a.length-1;i++)
            { 
                 a[i]=sc.nextInt();
            }
      
           System.out.println("Eter the value and Key");
           int value=sc.nextInt();
           int Key=sc.nextInt();
           a[a.length-1]=value;
           for(int i=Key;i<a.length;i++)
           {
                int temp=a[i];         
                a[i]=a[a.length-1];
                a[a.length-1]=temp;

           }
           for(int i=0;i<a.length;i++)
           {
                System.out.println(""+a[i]);
           }
       }
}