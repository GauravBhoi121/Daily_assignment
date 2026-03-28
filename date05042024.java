/*Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element 
is 2, or index number
 5 where the peak element is 6.

Note: you have to use binary search algorithm 
*/
import java.util.*;
class serachArray
{
     int a[],key;
     void setArray(int a[],int key)
     {
         this.a=a;
         this.key=key;
     }
     void getArrayexample1()
     {
         int first=0;
         int last=a.length-1;
         while(first<=last)
         {
              int mid=first+(last-first)/2;
              if(key>a[mid])
              {
                 first=mid+1;
              }
              else if(key<a[mid])
              {
                 last=mid-1;
              }
              else 
              {
                 System.out.println("index = "+(a[mid]-1));
                 break;
              }
          }
      }
      void getArrayexample2()
      {
         int first=0;
         int last=a.length-1;
         while(first<=last)
         {
              int mid=first+(last-first)/2;
              if(key>a[mid])
              {
                 first=mid+1;
              }
              else if(key<a[mid])
              {
                 last=mid-1;
              }
              else 
              {
                 System.out.println("index = "+mid);
                 break;
              }
          }
     }
}
class date05042024
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int a[]=new int [7];
      System.out.println("enter the value in array");
      for (int i=0;i<a.length;i++)
      {
         a[i]=sc.nextInt();
      }
      System.out.println("enter the key");
      int key=sc.nextInt();
     serachArray a1=new serachArray();
      a1.setArray(a,key);
      //a1.getArrayexample1();
      a1.getArrayexample2(); 
    }
}







