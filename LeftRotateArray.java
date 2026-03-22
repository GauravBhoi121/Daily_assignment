/*18. Left Rotate an Array by 1 or K Positions
Concept: Shift elements to the left and move the first elements to the end.
 Use Case: Circular queues, scheduling algorithms.
  */
import java.util.*;
public class LeftRotateArray
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner(System.in);
     int a[]=new int [6];
    
     for(int i=0;i<a.length;i++)
     {
          a[i]=sc.nextInt();
     }
     System.out.println("Enter the Key");
     int Key=sc.nextInt();
   
   
    for(int i=0;i<Key;i++)
    {
         int First=a[0];
         for(int j=0;j<a.length-1;j++)
         {
             a[j]=a[j+1];
         }
         a[Last]=First;
     }
                         
           
     System.out.println("Display");
     for(int i=0;i<a.length;i++)
     {
          System.out.print("\t"+a[i]);
     }
   }
}
