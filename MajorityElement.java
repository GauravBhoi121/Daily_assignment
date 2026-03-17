/*25. Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2   */
class MajorityElement
{
       public static void main(String args[])
       {
           int a[]={2,2,1,1,2,2,2};
          
            
            for(int i=0;i<a.length;i++)
            {
                int count=0;
               for(int j=0;j<a.length;j++)
               {
                   if(a[i]==a[j])
                   {
                       count++;
                   }
               }
               if(count>a.length/2)
               {
                    System.out.println(count+" "+a[i]);
                    break;
               }
            }
        }
 }