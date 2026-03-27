/*Move all negative numbers to the beginning
Rearrange the array such that all negative numbers are moved to the front.
Example:
Original Array: [1, -3, 2, -2, 5, -1, 4] 
Rearranged Array: [-3, -2, -1, 1, 2, 5, 4] */
import java.util.*;
class Array
{
    int a[];
    void setArray(int a[])
    {
      this.a=a;
    }
}
class negetiv extends Array
{
      void getremoveAll()
      {
          int b[]=new int [7];
          int count=0;
          for(int i=0;i<a.length;i++)
          {
            if(a[i]<0)
            {
               a[count++]=a[i];
            }
            b[i]=a[i];
          }
          System.out.println("diplay");
          while(count<a.length)
          {
               a[count]=0;
               count++;
          }
         for(int i=0;i<a.length;i++)
         {
           System.out.print(" "+a[i]);
         }
      }
}
class moveAllnegative
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int [7];
       System.out.println("enter the number in array");
       for(int i=0;i<a.length;i++)
       {
         a[i]=sc.nextInt();
       }
      negetiv a1=new negetiv();
      a1.setArray(a);
      a1.getremoveAll();        
    }
}