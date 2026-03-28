/*Q2.  Find the Minimum in a Rotated Sorted Array
  Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
  For example, the array nums = [0,1,2,4,5,6,7] might become: 

  [4,5,6,7,0,1,2] if it was rotated 4 times.
  [0,1,2,4,5,6,7] if it was rotated 7 times.
  Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
  1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

  Given the sorted rotated array nums of unique elements, 
  return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Your Task: you have to create class name as FindMinimumRotation with following methods 
void setArray(int a[]): this function can accept array as parameter 
void findMinRotationArray(): this function can find the minimum rotation of array.

Note: use binary search technique.
*/
import java.util.*;
class rotatedArray
{
    int a[],key;
    void setArray(int a[],int key)
    {
        this.a=a; 
        this.key=key;
    }
    void getrotatedArray()
    {
       int first=0;
       int last=a.length-1;
       if(key==key%a.length)     //it is add for key > a.length
       for(int i=a.length-1;i>0;i--)
       { 
         while(first<=last)
         {
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;    
            last--;
         }
       }
       for(int i=0;i<a.length;i++)
       {
            System.out.print(a[i]);
       }
    }
}
class date05042025
{
      public static void main (String args[])
      {
          Scanner sc=new Scanner(System.in);
          int a[]=new int [7];
          System.out.println("enter the sum value in array");
          for (int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
          System.out.println("enter the key to rotated array");
          int key=sc.nextInt();
          rotatedArray r1=new rotatedArray();
          r1.setArray(a,key);
          r1.getrotatedArray();
      }
}