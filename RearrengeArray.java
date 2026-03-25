/* 26. Rearrange Array in Alternate Positive and Negative Items
Concept: Use auxiliary arrays or index manipulation to interleave.
 Use Case: Alternate scheduling, balancing data flow.
Input: arr = [2, 3, -4, -1, 6, -9]
 
Separate positives: [2, 3, 6]
Separate negatives: [-4, -1, -9]
Rearranged array: [2, -4, 3, -1, 6, -9]   */
public class RearrengeArray
{
       public static void main(String args[])
       {
          int a[]={2,3,-4,-1,6,-9};
          
          int acount[]=new int [a.length];
          int bcount[]=new int [a.length];
          int bi=0,ai=0;
         for(int i=0;i<a.length;i++)
         {
             if(a[i]>=0)
             {
                acount[ai++]=a[i];
             }
             else  
             {
                  bcount[bi++]=a[i];
                 
             }
         }
         for(int i=0;i<ai;i++)
         {
               System.out.print(" "+bcount[i]+" "+acount[i]);
         }
       
     }
}
           