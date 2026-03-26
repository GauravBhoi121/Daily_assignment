/*Given an array of integers and a window size k, for each window of size k, print the first negative integer in that window. If a window does not contain a negative integer, print 0.
Concept and Sliding Window Logic
1.Use a queue (Deque) to store the indices of negative numbers in the current window.
2.Slide the window from left to right:
3.Add the current element’s index to the queue if it is negative.
4.Remove elements out of the current window from the queue.
5.The element at the front of the queue is the first negative number for the current window.
6.If the queue is empty, it means no negative number is present in that window → Output 0.
Example:
Input: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
Windows:
[12, -1, -7]      → First negative: -1  
[-1, -7, 8]       → First negative: -1  
[-7, 8, -15]      → First negative: -7  
[8, -15, 30]      → First negative: -15  
[-15, 30, 16]     → First negative: -15  
[30, 16, 28]      → No negative → 0
Output: [-1, -1, -7, -15, -15, 0] */
import java.util.*;
public class SubArrayQ0207
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
        int a[]=new int[]{12, -1, -7, 8, -15, 30, 16, 28};
        
        for(int i=0;i<a.length-2;i++)
        {
                if(a[i]<0)
                {
                   System.out.println(""+a[i]);
                }
                else if(a[i+1]<0)
                {
                   System.out.println(""+a[i+1]);
                }
                else if(a[i+2]<0)
                {
                     System.out.println(""+a[i+2]);
                }
                else 
                {
                   System.out.println(0);
                }
         }
          
   }
}

  








