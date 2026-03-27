
/*Q4.
_____________________________________________________________
Given a sorted array and a target, find the smallest element in the array that is greater than the target.
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.
Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:
Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that are lexicographically greater than 'z' so we return letters[0].
Your Task: you have to create class name as SmallestGreaterThan with following methods 
void acceptArray(char a[]): this function can accept character array as input 
void findSmallestChar(char skey): this function accept search key as parameter and find the greater element 
Note: you have to use binary search algorithm */
import java.util.*;
class srearcharArray
{
   char ch[],key;
   void setcharArray(char ch[],char key)
   {
       this.ch=ch;
       this.key=key;
   }
   void getcharArray()
   {
      int first=0;
      int last=ch.length-1;
      while(first<=last)
      {
          int mid=first+(last-first)/2;  // ["c","f","j"],
          if(ch[mid]<=key)
          {
            first=mid+1;
          }
          else
          {
              last=mid-1;
          }
      }
      System.out.println(ch[first]);
   }
   void getexample2()
   {
       int first=0;
       int last=ch.length-1;
       while(first<=last)              //["c","f","j"], target = "c"  print next element =j
       {
           int mid=first+(last-first)/2;
           if (key>ch[mid])
           {
              first=mid+1;
           }
           else if(key<ch[mid])
           {
                last=mid-1;
           }
           else
           {
               System.out.println(ch[mid+1]);
               break;
           }
       }
    }  
    void getexample3()
    {
        int first=0;
        int last=ch.length-1;
        while(first<=last)
        {
           int mid=first+(last-first)/2;  // [ x x y y ],
          if(ch[mid]>key)
          {
            first=mid+1;
          }
          else
          {
              last=mid-1;
          }
      }
      if(key=='z')
      {  System.out.println(ch[first]);
      }
    }    
}
class finsmallcharelement
{
       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           char ch[]=new char [3];
           System.out.println("enter the element");
           for(int i=0;i<ch.length;i++)
           {
               ch[i]=sc.nextLine().charAt(0);
           }
           System.out.println("search key");
           char key=sc.nextLine().charAt(0);
           srearcharArray  c1=new srearcharArray();
           c1.setcharArray(ch,key);
          // c1.getcharArray();
          //c1.getexample2();
          c1.getexample3();
        }
}

