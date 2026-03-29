/*   8. Convert String to Uppercase / Lowercase
Description: Change all characters to uppercase or lowercase.
 Example: Input: "Hello" → Output uppercase: "HELLO"   */
class convertStringToUpperToLower
{
    public static void main(String args[])
    {
          String s="Hello";
          
           char ch[]=s.toCharArray();
          for(int i=0;i<ch.length;i++)
          {
            /* if(ch[i]<='Z' && ch[i]>='A')
             {
                 i++;
             }
             else */if(ch[i]<='z' && ch[i]>='a')
             {
                  ch[i]=(char)(ch[i]-32);
             }
             System.out.print(ch[i]+"  ");
          }
    }
}
               