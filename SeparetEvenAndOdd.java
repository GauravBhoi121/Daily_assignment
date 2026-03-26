/* 16. Separate Even and Odd Numbers
Concept: Iterate and store evens in one array, odds in another.
 Use Case: Categorize numbers or IDs based on properties.
Input: arr = [12, 17, 70, 15, 22, 65, 21, 90]
Even Numbers: [12, 70, 22, 90]
Odd Numbers: [17, 15, 65, 21]
*17. Count Even and Odd Elements
Concept: Use modulo operator and count each category.
 Use Case: Statistical breakdowns.
Input: arr = [10, 21, 32, 43, 54, 65, 76]
Total Even Numbers: 4
Total Odd Numbers: 3  */
import java.util.*;
public class SeparetEvenAndOdd
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          ArrayList<Integer> l= new ArrayList<>();
          ArrayList<Integer> Even= new ArrayList<>();
          ArrayList<Integer> Odd= new ArrayList<>();
          int Ecount=0;
          int Ocount=0;
          for(int i=0;i<8;i++)
          {
             int n=sc.nextInt();
             if(n%2==0)
             {
               Even.add(n);
               Ecount++;
             }
             else
             {
                Odd.add(n);
                Ocount++;
             }
             l.add(n);
          }           
          Iterator i=l.iterator();
          System.out.println("add Element "+l);
          System.out.println("add Element Even "+Even);
          System.out.println("add Element Odd "+Odd);
          System.out.println("Even Number Count is "+Ecount);
          System.out.println("Odd Number Count is "+Ocount);
                    
      }
}
          