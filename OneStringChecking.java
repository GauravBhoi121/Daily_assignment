/* 9. Check if String is a Substring
Description: Determine if one string is contained within another.
 Example: Input: "hello world", "world" → Output: True   */
class  OneStringChecking
{
       public static void main(String args[])
       {
           String s="hello world";
           
           String s2="world";
             String ch[]=s.split(" ");
        
            for(String sp:ch)
            {
            System.out.println("String are there"+sp); 
              if(sp.equals(s2))    
                  System.out.println("String are there"); 
                
            }
     }
}