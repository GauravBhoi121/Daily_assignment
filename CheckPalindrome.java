/*  2. Check Palindrome
Description: Check if a string reads the same backward and forward.
 Example: Input: "madam" → Output: True  */
import java.util.*;
public class CheckPalindrome
{
      public static void main(String args[])
      {
           Scanner sc=new Scanner(System.in);
           String s="aaa";
           int count=1;
           for(int i=0;i<s.length();i++)
           {
              if(s.charAt(i)==s.charAt(s.length()-count))
              {
                 System.out.println(s.charAt(i));
                 count++;
              }
              else
              {
                break;
              }
          }
          if((count-1)==s.length())
             System.out.println((count-1)+" it is pelindrom String "+s.length());
      }
}