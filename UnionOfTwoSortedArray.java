/* 11. Union of Two Sorted Arrays
Idea: Two pointers iterate both arrays merging without duplicates.
Example:
 arr1 = [1, 2, 3], arr2 = [2, 3, 4] → union: [1, 2, 3, 4]  */
import java.util.*;
public class UnionOfTwoSortedArray
{
      public static void main(String args[])
      {
         Scanner sc=new Scanner(System.in);
         int a[]={1,2,3};
         int b[]={2,3,4};
         
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
           c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[i+a.length]=b[i];
        }
        Arrays.sort(c);
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<c.length;i++)
            map.add(c[i]);

      System.out.println(map);
     }
 }