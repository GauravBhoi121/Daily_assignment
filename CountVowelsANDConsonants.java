/*  3. Count Vowels and Consonants
  Description: Count the number of vowels and consonants in a string.
 Example: Input: "apple" → Vowels: 2, Consonants: 3    */
import java.util.*;
public class CountVowelsANDConsonants
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="applea,s,d,f,g,h,j,k";
        int Vowels=0;
        int Consonant=0;
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
          if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
          
           if(s.charAt(i)=='a' || s.charAt(i)=='u' ||s.charAt(i)=='o' ||s.charAt(i)=='i' ||s.charAt(i)=='e' ||s.charAt(i)=='A' || s.charAt(i)=='U' ||s.charAt(i)=='O' ||s.charAt(i)=='I' ||s.charAt(i)=='E' )
           {
              Vowels++;
           }
           else
           {
                Consonant++;
           }
         }
        }
        System.out.println(Vowels+" "+Consonant);
    }
}