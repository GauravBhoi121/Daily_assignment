/*1) Employee Management System
Problem:
 Create a Employee POJO class with fields: empId, name, salary, department.
 Write a Java program that:
Creates an array of Employee objects (size 5).

Takes input for each employee.

Increases the salary by 10% for employees in the IT department.

Displays all employee details after increment.

Explanation:
 Focus on class design, object creation, and simple logical operation (conditional percentage increase).*/
import java.util.*;
class Employee
{
     private String Name;
     private int Id;
     private int Salary;
     private String Department;
     
    public void setName(String Name)
    {
      this.Name=Name;
    }
    public String getName()
    {
       return Name;
    }
    public void setId(int Id)
    {
       this.Id=Id;
    }
    public int getId()
    { 
        return Id;
    }
    public void setSalary(int Salary)
    {
        this.Salary=Salary;
    }
    public int getSalary()
    {
        return Salary;
    }      
    public void setdepartment(String Department)
    {
      this.Department=Department;
    }
    String getdepartment()
    {
       return Department;
    }
}
public class EmployeeApp2506
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Employee emp[]=new Employee[1];
      
        for(int i=0;i<emp.length;i++)
        {
           emp[i]=new Employee();
           System.out.println("enter the name ");
           String Name=sc.nextLine();
           System.out.println("enter the Id ");
           int Id=sc.nextInt();
           System.out.println("enter the Salary ");
           int Salary=sc.nextInt();
           System.out.println("enter the Department name ");
           sc.nextLine();
           String Department=sc.nextLine();
          
       
           emp[i].setName(Name);
           emp[i].setSalary(Salary);
           emp[i].setId(Id);
           emp[i].setdepartment(Department);
        }
         System.out.println("Employee Salary add 10% increment");
         for(int i=0;i<emp.length;i++)
         {
             if(emp[i].getdepartment().compareTo("IT")==0)
             {
                 emp[i].setSalary(emp[i].getSalary()*10/100);
             }  
         }
        
         System.out.println("Employee Salary add 10% increment");
         for(int i=0;i<emp.length;i++)
         {
               System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getdepartment()+"\t"+emp[i].getSalary());
         }
   }
}
                   
            





