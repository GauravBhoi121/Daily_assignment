/*1: College Management – Merit List Generation
Description:
 Create a Student POJO class with attributes: rollNo, name, marks[], and totalMarks.
 Now write logic to:
Input marks of 5 subjects for N students.
Calculate total marks of each student.
Display top 3 students based on total marks.

Constraints:
Use only arrays and POJO class (no Collections).

Marks per subject are between 0 and 100.
Expected Concepts:
Class and object creation

Array of objects
Manual sorting logic (e.g., bubble sort)
Logical comparison
*/
import java.util.*;
class Student
{
   private int RollN;
   private String Name;
   private int Marks[];
   private int TotalMarks;
   
   public void setRollN(int RollN)
   {
        this.RollN=RollN;
   }
   public int getRollN()
   { 
       return RollN;
   }
   public void setName(String Name)
   {
       this.Name=Name;
   }
   public String getName()
   {
       return Name;
   }
   public void setMarks(int Marks[]) 
   {
     this.Marks=Marks;
   }
   public int [] getMarks()
   { 
     return Marks;
   }
   void setTotalMarks(int TotalMarks)
   {
     this.TotalMarks=TotalMarks;
   }   
   int getTotalMarks()
   {
      return TotalMarks;
   }
}
public class CollegeManegmentApp2606
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
       
        Student s[]=new Student[1];
        int Marks[]=new int [5];

        for(int i=0;i<s.length;i++)
        {    int TotalMarks = 0;
           s[i]=new Student();
           
           System.out.println("enter the RollN");
           int RollN=sc.nextInt(); 
           sc.nextLine();
           System.out.println("enter the student Name"); 
           String Name=sc.nextLine();
           System.out.println("enter the Student Marks");
           for(int j=0;j<Marks.length;j++)
           {   
                
                Marks[j]=sc.nextInt();  
		TotalMarks = TotalMarks + Marks[j];
           }
           s[i].setRollN(RollN);
           s[i].setName(Name);
	   s[i].setTotalMarks(TotalMarks);         
           s[i].setMarks(Marks);
        }
        
        System.out.println("Top 3 student ");
        for(int i=0;i<s.length;i++)
        {
             for(int j=0;j<s.length;j++)
             {
                 if(s[i].getTotalMarks()>s[j].getTotalMarks())
                 {
                    Student o=s[i];
                        s[i]=s[j]; 
                        s[j]=o;
                 }
              }
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i].getName()+s[i].getRollN()+s[i].getTotalMarks());
        }
    }
}