/*2: Bank Management System – Loan Eligibility Checker
Description:
Create a Customer POJO class with fields: custId, name, accountBalance, monthlySalary, creditScore.
Now implement logic to:
Read data of N customers.
Check loan eligibility using rules:
Salary > 25000
Credit Score >= 700
Account Balance > 10000
Print names of eligible customers.
Expected Concepts:
Multiple conditions
Decision-making logic
Filtering using class objects*/
class Bank
{
    private int Cid;
    private String Name;
    private double AccountB;
    private double ManthlySalary;
    private int CreditScore;
    
    public void setCid(int Cid)
    {
        this.Cid=Cid;
    }
    public int getCid()
    {
       return Cid;
    }
    public void setName(String Name)
    {
       this.Name=Name;
    }
    public String getName()
    {
       return Name;
    }
    public void setAccountB(double AccountB)
    {
        this.AccountB=AccountB;
    }      
    public double getAccountB()
    {
      return AccountB;  
    }
    public void setManthlyS(double ManthlySalary)
    {
       this.ManthlySalary=ManthlySalary;
    }
    public double getManthlyS()
    {
       return ManthlySalary;
    }
    public void setCreditS(int CreditScore)
    {
       this.CreditScore=CreditScore;
    }
    int getCreditS()
    {
       return CreditScore;
    }
    Bank(int Cid,String Name,double AccountB,double ManthlySalary,int CreditScore)
    {
        this.Cid=Cid;
        this.Name=Name;
        this.AccountB=AccountB;
        this.ManthlySalary=ManthlySalary;
        this.CreditScore=CreditScore;
    }
    String Dispaly()
    {
        return "Cid:"+Cid+" Name:"+Name+" ManthlySalary:"+ManthlySalary+" AccountB:"+AccountB+" creditScore:"+CreditScore;
    }
}
public class BankManegamentS2606
{
   public static void main(String args[])
   { 
      Bank bk[]=new Bank[3];  
      bk[0]=new Bank(1,"manish",30000,20000,708);  
      bk[1]=new Bank(2,"suresh",200000,30000,900);
      bk[2]=new Bank(3,"raju",10000,20000,700);
     
      System.out.println("display the account holder");
      for(int i=0;i<bk.length;i++)
      {
         if(bk[i].getManthlyS()>25000 && bk[i].getCreditS()>700 && bk[i].getAccountB()>100000)
         {
            System.out.println(bk[i].Dispaly());
         }

       
      }

      
   }
 
}