/* 8. Maximum Number of Consecutive Ones After Flipping K Zeros
Example:
 Input: arr = [1,0,0,1, 1, 0, 1, 1, 1], K=2
 Output: 6
  
            
 */
import java.util.*;
public class MaxNumberOFoneAfterConsecutiveKZero
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         
          int a[]={1,0,0,1, 1, 0, 1, 1, 1};
          int value=2;
           int Max=Integer.MIN_VALUE;
           
           int index=0;
         
          for(int i=0;i<a.length;i++)
          {   
             int flag=0;
            for(int j=index;j<a.length;j++)
            { 
               if(a[index]==0) 
               { 
                   if(a[j+1]==0)
                   {
                      index=j+2;
                      flag=1;
                   }
      
                      System.out.print("I"+j);
     
               } 
               if(flag==1)
               {
                    break;
               }
                  System.out.print(a[j]);                     
            }      
            System.out.println("  ");   
            i+=index;    
          }
          System.out.println("Max is "+Max);
       }
}
                 