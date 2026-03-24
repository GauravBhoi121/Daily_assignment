/* 27. Find the Missing Number in a Series (1 to N)
Concept: Sum of 1 to N minus the actual sum of array gives the missing number.
 Use Case: Identify lost entries, IDs, etc.
N = 5
Input : arr = [1, 2, 4, 5]
Calculation:
Sum of numbers from 1 to 5 = 5×62=15\frac{5 \times 6}{2} = 1525×6​=15
Sum of array elements = 1+2+4+5=121 + 2 + 4 + 5 = 121+2+4+5=12
Missing number = 15−12=315 - 12 = 315−12=3
Output: Missing number is: 3  */
import java.util.*;
public class MissingElement
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int a[]=new int [5];
         for(int i=0;i<a.length;i++)
         {
            a[i]=sc.nextInt();
         }
         for(int i=0;i<a.length-1;i++)
         {
              for(int j=a[i];j<a[i+1];j++)
              {
                 if(a[i]!=j)
                    System.out.println(" "+j);
              }
         }
     }
}