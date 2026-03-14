import java.util.*;
class ArrayApp 
{
    public int MaxElement(int a[])
    {
        int Max=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]>Max)
           {
               Max=a[i];
           }
        }
        return Max;
     }
     public int MinElement(int a[])
     {
         int Min=a[0];
         for(int i=0;i<a.length;i++)
         {
             if(a[i]<Min)
             {
               Min=a[i];
             }
         }
      return Min;
     }
     public int sumOf(int a[])
     {
           int sum=0;
           for(int i=0;i<a.length;i++)
           {
              sum+=a[i];
           }
         return sum;
      }
      public float AverageOf(int a[])
      {
            float Avg=0;
            for(int i=0;i<a.length;i++)
            {
               Avg+=a[i];
            }
            return Avg/a.length;
      } 
      public boolean linearSearch(int a[],int Key)
      {
          
          for(int i=0;i<=a.length;i++)
          {
             if(a[i]==Key)
             {
                return true;
             } 
          }
          return false;
       }
       public void FreQuencyElement(int a[]) 
       {
           for(int i=0;i<a.length;i++)
           {
                int count=1;
               for(int j=i+1;j<a.length;j++)
               {
                  if(a[i]==a[j])
                  {
                     count++;
                     a[j]=-1;
                  }
               }
             if(a[i]!=-1)
             {
    System.out.println(a[i]+" occurs\t"+count+" Time");
             }
           }
       }
       public void reverseOf(int a[])
       {
           for(int i=a.length-1;i>=0;i--)
           {
             System.out.println("\t"+a[i]);
           }
       }
       public void copyOneTwoAnothor(int a[])
       {
           int b[]=new int [a.length];
           for(int i=0;i<a.length;i++)
           {
             b[i]=a[i];
           }
           for(int i=0;i<b.length;i++)
           {
             System.out.println(b[i]);
           }
       }
       public void MargeArray(int a[],int b[])
       {
            int c[]=new int [a.length+b.length];
            for(int i=0;i<a.length;i++)
            {
              c[i]=a[i];
            }
            for(int i=0;i<b.length;i++)
            {
              c[a.length+i]=b[i];
            }
            for(int i=0;i<c.length;i++)
            {
              System.out.print(c[i]+"\t");
            }
       }
       public void ArrayinAccending(int a[])
       {
            for(int i=0;i<a.length;i++)
            {
               for(int j=0;j<a.length;j++)
               {
                    if(a[i]<a[j])
                    {
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp; 
                    }
               }
            }
            for(int i=0;i<a.length;i++)
            {
                 System.out.print(a[i]+"\t");  
            }
       }
       public void ArrayinDecending(int a[])
       {
           for(int i=0;i<a.length;i++)
            {
               for(int j=0;j<a.length;j++)
               {
                    if( a[i]>a[j])
                    {
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp; 
                    }
               }
            }
            for(int i=0;i<a.length;i++)
            {
                 System.out.print(a[i]+"\t");  
            }
       }   
       public int secondLargestElement(int a[])     
       {  
           int Max=0;
           int SecondMax=0;
           for(int i=0;i<a.length;i++)
           {
              if(a[i]>Max)
              {
                  SecondMax=Max;
                  Max=a[i];
                 
              }
              else if(a[i]!=Max && Max<SecondMax)
              {
                 SecondMax=a[i];
              }
           }
           return SecondMax;
       }
       public int secondMinElement(int a[])
       {
            int Min=a[0];
            int SecondMin=-1;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]<Min)
                {
                   SecondMin=Min;
                   Min=a[i];
                }
                else if(a[i]!=Min && Min>SecondMin)
                {
                  SecondMin=a[i];
                }
            }
           return SecondMin;
       }
       public void removeDuplicates(int a[])
       {
          for(int i=0;i<a.length;i++)
          {
               for(int j=i+1;j<a.length;j++)
               {
                  if(a[i]==a[j])
                  {
                     a[j]=-1;
                  }
               }
               if(a[i]!=-1)
               {
                   System.out.println(a[i]);
               }
          }
       }
       public int countNumberOfDuplicate(int a[])
       {
            int Max=0;
            for(int i=0;i<a.length;i++)
            {
                 int count=0;
                for(int j=i+1;j<a.length;j++)
                {
                   if(a[i]==a[j])
                    {
                       count++;
                    }
                }
                if(count>Max)
                   Max=count;
            }
            return Max;
       }                     
}        
public class Assignment080925
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          ArrayApp a=new ArrayApp();
          System.out.println("Enter the number in array Size");
          int n=sc.nextInt();
          int arr[]=new int [n];
          System.out.println("Enter the Array value "+n);
          for(int i=0;i<arr.length;i++)
          {
               arr[i]=sc.nextInt();
          }

      System.out.println("Enter the choice 1:Max , 2:Min ,3:Sum ,4:Avg ,5:Linear Search 6:Frequency 7:ReverseOf ,8:Copy One Two Anothor ,9:Marge Array ,10:Array in Accending 11:array in decending 12:second Largest Element 13:second Min Element,");
      int choice=sc.nextInt();
      switch(choice)
      {
          case 1:  int result=a.MaxElement(arr);
                   System.out.println("Max value Is "+result);
                   break;
        
          case 2:  result=a.MinElement(arr);
                   System.out.println("Min value Is "+result);
                   break;
    
          case 3:  result=a.sumOf(arr);
                   System.out.println("Array Sume is "+result);  
                   break;

          case 4:  float Result=a.AverageOf(arr);
                   System.out.println("Averege is "+Result);
                   break;

          case 5:  System.out.println("Enter the Key");
                   int Key=sc.nextInt();
                   boolean b=a.linearSearch(arr,Key);
                   System.out.println("number is there "+b);
                   break;
          case 6:  System.out.println("Element Is :");a.FreQuencyElement(arr);
                   break;

          case 7:  System.out.println("reverse Element"); a.reverseOf(arr); break;

          case 8: System.out.println("Copyd Array"); a.copyOneTwoAnothor(arr); break;
          case 9: 
                  System.out.println("Enter the value");
                  n=sc.nextInt();
                  System.out.println("Enter the Anothor Array");
                  int B[]=new int[n];
                  for(int i=0;i<B.length;i++)
                  {
                    B[i]=sc.nextInt();
                  }
                  a.MargeArray(arr,B);
                  break;
          case 10:System.out.println("Array Accending"); a.ArrayinAccending(arr); break;
          case 11:System.out.println("Array Descending"); a.ArrayinDecending(arr);break;
          case 12: result =a.secondLargestElement(arr); System.out.println("Largest Element is"+result); break;
          case 13: result=a.secondMinElement(arr); System.out.println("Second smalllest Element is"+result); break;
          case 14:System.out.println("");break;
          case 15:System.out.println("");break;
          default:
                   System.out.println("Wrong choice");
        }
      } 
}











