/*2.Accept 10 words from user and store in a Set to remove duplicates. Then convert the set to a list and sort it.*/
import java.util.*;
public class Practicaltwo3006
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       HashSet<Character> sp=new HashSet<Character>();
       sp.add('a');
       sp.add('b');
       sp.add('s');
       sp.add('k');
       sp.add('e');
       ArrayList<Character> al=new ArrayList<Character>(sp); 
       System.out.println(al);
   }
}