import java.util.*;
public class HashMapPractical2806
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        
         System.out.println("Practical Program 1,2,3" );
         int choice=sc.nextInt();
         switch(choice)
         {
            case 1:    
                        HashMap<Integer,String> Map=new HashMap<Integer,String>();
                        Map.put(1,"rahul");
                        Map.put(2,"Mahesh");
                        Map.put(3,"Suresh");
                        Map.put(4,"Ganesh");
                        Map.put(5,"ramesh");
                             
                            //Set<Map.Entry<Integer,String>> hm=Map.entrySet();
                            System.out.println("enter the Roll Number");
                            int RollN=sc.nextInt();
                            if(Map.containsKey(RollN))
                            {
                               System.out.println(Map.get(RollN));
                            }
                       
                        break;
            default:
                       System.out.println("Its Wrong Choice");
         }  
                            
     } 
}
