/* 5. Check Anagram
Description: Check if two strings are anagrams (contain same characters in any order).
 Example: Input: "listen", "silent" → Output: True  */
class AnagramString
{
     public static void main(String args[])
     {
          String a="listen";
          String b="silent";
      
            int count=0;
          if(a.length()==b.length())
                 for(int i=0;i<a.length();i++)
                 {
                        for(int j=0;j<b.length();j++)
                        {
                            if(a.charAt(i)==b.charAt(j))
                             {
                                 count++;
                                 break;
                             }
                        }
                  }
                  if(count==a.length())
                      System.out.println("Ha Anna Gram String ahe");
        }
}