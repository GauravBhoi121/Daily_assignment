/*  7. Remove Duplicate Characters
Description: Remove all duplicates, keep first occurrences.
 Example: Input: "banana" → Output: "ban"   */
class RemoveDuplicate
{
       public static void main(String args[])
       {
            String s="bananacnana";
            char ch[]=s.toCharArray();
            
            for(int i=0;i<ch.length;i++)
            {
                 for(int j=i+1;j<ch.length;j++)
                 {
                     if(ch[i]==ch[j])
                      {
                          ch[j]='0';
                      }
                  }
             if(ch[i]!='0')
             {
                   System.out.print(" "+ch[i]);
             }
             }
            
        }
}