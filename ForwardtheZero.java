/*6. Move All Zeros to End
Idea: Two pointers to swap non-zero elements forward.
Example:
 arr = [0, 1, 0, 3, 12] → after operation → [1, 3, 12, 0, 0]  */
import java.util.*;
public class ForwardtheZero
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
        int a[]={0,0,0,1,0,0,0,0,0,0,0,3,0,0,0,12,0,0,0};
        int First=0;
        for(int i=0;i<a.length;i++)
        {    
             if(a[i]!=0)
             {
                a[First++]=a[i];
               
             }
    	      
        }
      while(a.length>First)
        {
             a[First]=0;
              First++;
        }
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]);
         }
     }
}
