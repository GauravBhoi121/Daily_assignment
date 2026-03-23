//3.Take a string from the user and count the frequency of each character using Map<Character, Integer>.
import java.util.*;
class MapFrequencyck
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       HashMap<Character,Integer> Map=new HashMap<Character,Integer>();
       Map.put('a',20);
       Map.put('b',30);
       Map.put('c',50);
       Map.put('d',20);
       Map.put('f',30);
      Set<Map.Entry<Character,Integer>> m=Map.entrySet();
      
          System.out.println("enter the Key ");
          char ch=sc.next().charAt(0);
          int count=0;
      for(Map.Entry ss:m)
      {
         for(Map.Entry pp:m)
         {
             if(ch==pp.getKey())
             {
                count++;
             }    
         }
      }
   }
}