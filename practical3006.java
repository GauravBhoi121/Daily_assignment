/*1. Create a Map<Integer, List<String>> where each key is a class (like 1, 2, 3...) and value is a list of student names in that class.*/
import java.util.*;
public class practical3006
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     
       ArrayList<String> l=new ArrayList<String>();
       l.add("A");
       l.add("B");
       l.add("c");
       ArrayList<String> p=new ArrayList<String>();
       p.add("e");
       p.add("f");
       p.add("g");
       ArrayList<String> s=new ArrayList<String>();
       s.add("h");
       s.add("i");
       s.add("j");
       HashMap<Integer,List<String>> Map=new HashMap<Integer,List<String>>(); 
       Map.put(1,l);
       Map.put(2,p);
       Map.put(3,s);
       for(Map.Entry<Integer,List<String>> ss:Map.entrySet())
       {
            System.out.println(ss.getKey()+"\t"+ss.getValue());
       }
   }
}