/*  1. Reverse a String
Description: Reverse the characters in a string.
 Example: Input: "hello" → Output: "olleh"   */
import java.util.*;
public class ReverseAString
{
      public static void main(String args[])
      { 
           Scanner sc=new Scanner(System.in);
           
            System.out.println("Enter a String");
            String s="a b c d e f";

            for(int i=s.length()-1;i>=0;i--)
            {
                System.out.print(s.charAt(i));
            }
     }
}