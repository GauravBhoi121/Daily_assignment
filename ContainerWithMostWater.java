/* 13. Container With Most Water
Idea: Two pointers at start and end, move pointer with smaller height inward maximizing area.
Example:
 heights = [1,8,6,2,5,4,8,3,7] → max area = 49  */
import java.util.*;
public class ContainerWithMostWater
{
       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
        
          int a[]={1,8,6,2,5,4,8,3,7};
      
          int first=0;
          int last=a.length-1;
          int Maxarea=0;
       
          while(first<last)
          {
                int h;
               
                if(a[first]<a[last])
                {
                    h=a[first];
                } 
                else
                {
                   h=a[last];
                }
                
               int width=last-first;
               int area=h*width;
               if(area>Maxarea)
               {
                  Maxarea=area;
               }
              
               if(a[first]<a[last])
               {
                  first++;
               }
               else
               {
                  last--;
               }
          }
         System.out.println("Max area is "+Maxarea);
      }
}
               
          