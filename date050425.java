/*Q3.Find the Position of an Element in a Sorted Array with Duplicates
Example:
Input: array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
num = 5;find
Output: Element 5 found at index 7

Your Task : you have to create class name as FindPosition with following methods 

void setArray(int a[]): this function can accept array as parameter 
void findPosition(int skey): this function can find the last index of search key if key is duplicated 
Q4. Count the Number of Occurrences of a Target
___________________________________________________________________
Given a sorted array of integers, find the number of occurrences of a given target value.
 Your algorithm’s runtime complexity must be in the order of O(log n).
 If the target is not found in the array, return 0
**Example : **
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return 2.

*/
import java.util.*;
class duplicates
{ 
     int a[],val;
     void setArray(int a[],int val)
     {
       this.a=a;
       this.val=val; 
     }
     void getdupliactes()    // {0, 1, 2, 2, 4, 5, 5, 5, 8};
     {
         int count=0;
         for(int i=0;i<a.length;i++)
         {
            if(a[i]==val)
            {  
                count=i;
            }
         }
         System.out.println(""+count);
         
     }
     void getoccrrences()   
     {
         int count=0;
         for (int i=0;i<a.length;i++)
         {
            if(a[i]==val)
            {
              count++;
            }
         }
       System.out.println(count);
            
     } 
} 
class date050425
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          int a[]=new int [9];
          System.out.println("enter the value in array");
          for (int i=0;i<a.length;i++)
          {
             a[i]=sc.nextInt();
          }
          System.out.println("enter the search value");
          int val=sc.nextInt();
          duplicates d1=new duplicates();
          d1.setArray(a,val);
          //d1.getdupliactes();
          d1.getoccrrences();
       }
 }