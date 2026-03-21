/*23. Find the Frequency of a Specific Element
Concept: Count how many times a given value appears in the array.
 Use Case: Count votes, survey results, repeated entries.
Input:  arr = [4, 5, 6, 4, 7, 4, 8]
Target element = 4
Frequency of element 4 is: 3  */
public class FrequencyElement
{
      public static void main(String args[])
      {
           int a[]={1,4,3,4,5,6,4};
 
           int count=0; 
           int value=4;
           for(int i=0;i<a.length;i++)
           {
             if(a[i]==4)
                count++;
           }
           System.out.print("value count -"+count);
      }
}