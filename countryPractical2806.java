/*1.Create a program to store 5 country names and their capitals using HashMap. Display all entries.
 */
import java.util.*;
public class countryPractical2806
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        
        HashMap<String,String> Map=new HashMap<String,String>();
        
       Map.put("india","dehli");
       Map.put("Japan","Tokyo");
       Map.put("France","Paris");
       Map.put("United","States");
      
      Set<Map.Entry<String,String>> ms=Map.entrySet();
 
       for(Map.Entry sp:ms) 
       {
           System.out.println(""+sp.getKey()+"\t"+sp.getValue());
       }
   }
}