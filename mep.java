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
    private int Id;
    private String Name;
    private int Salary;
    private String Department; 
 
    void setId(int Id)
    {
       this.Id=Id;
    }
    int getId()
    {
        return Id;
    }
    void setSalary(int Salary)
    {
       this.Salary=Salary;
    }
    int getSalary()
    {
        return Salary;
    }
    void setName(String Name)
    {
       this.Name=Name;
    }
    String getName()
    {
        return Name;
    }
    void setDepartment(String Departemnt)
    {
       this.Department=Department;
    }
    String getDepartment()
    {
        return Department;
    }
}
public class EmployeeAppManegment2506
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       Employee emp[]=new Employee[5];
       
       for(int i=0;i<emp.length;i++)
       {
           emp[i]=new Employee();
           
           System.out.println("enter the Employee name ");
           String Name=sc.nextLine();
           sc.nextLine();
           System.out.println("enter the Employee Id ");
           int Id=sc.nextInt();
           System.out.println("enter the Employee Salary ");
           int Salary=sc.nextInt();
           System.out.println("enter the Employee department ");
           String Department=sc.nextLine();
           sc.nextLine(); 
      
           emp[i].setName(Name);
           emp[i].setId(Id);
           emp[i].setSalary(Salary);
           emp[i].setDepartment(Department);
         }
    }
}
       
           
   





