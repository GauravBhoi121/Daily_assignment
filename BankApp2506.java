/*2) Bank Account Operation
Problem:
 Create a BankAccount POJO class with fields: accountNumber, accountHolderName, balance.
 Write a Java program that:
Creates 3 bank account objects.
Performs deposit and withdrawal operations.

Prevents withdrawal if balance is insufficient.

Displays final details of all accounts.

Explanation:
 Practice encapsulation and condition checking (sufficient balance) with proper field updates.*/
import java.util.*;
class Bank
{
    private int AccountNumber;
    private int Balance;
    private String AccountHolderName;
    
    void setAccountN(int AccountNumber)
    {
        this.AccountNumber=AccountNumber;
    }
    int getAccountN()
    {
        return AccountNumber;
    }
    void setAccountB(int Balance)
    {
        this.Balance=Balance;
    }
    int getAccountB()
    {
       return Balance;
    }
    void setAcHoName(String AccountHolderName)
    {
         this.AccountHolderName=AccountHolderName;
    }
 }
public class BankApp2506
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      
       Bank B[]=new Bank[2];
       for(int i=0;i<B.length;i++)  
       {
          B[i]=new Bank();
         
          System.out.println("enter the Account Number ");
          int AccountN=sc.nextInt();
          System.out.println("inter the ammount for deposite");
          int Balance=sc.nextInt();
          System.out.println("enter Account Holder Name");
          String Name=sc.nextLine();
          sc.nextLine();
 
          B[i].setAccountN(AccountN);
          B[i].setAccountB(Balance);
          B[i].setAcHoName(Name);
          System.out.println("===============================================================");
        }
       do{
       System.out.println("enter 1. for deposit\n enter 2. for withdrawal\n enter 3. for");
       System.out.println("===============================================================");
       System.out.println("enter the choice ");
       int choice=sc.nextInt();
       switch(choice)
       {
            case 1:
                      System.out.println("enter the AcNumber");
                      int AccountN=sc.nextInt();
                      System.out.println("Enter the diposite Ammount");
                      int Ammount=sc.nextInt();
                       if(Ammount<0)                      
                       {
                          System.out.println("its not valide Ammount");
                       }
                      for(int i=0;i<B.length;i++) 
                      {
                         if(B[i].getAccountN()==AccountN) 
                          {
                              B[i].setAccountB(B[i].getAccountB()+Ammount);
                              System.out.println("Ammount is add");
                              System.out.println("total is  = "+B[i].getAccountB());
                          }
                          if(B[i].getAccountN()!=AccountN) 
                          {
                             System.out.println("wrong ac number");
                          }
                      }
                      System.out.println("===============================================================");
                      break;
         case 2:
                      System.out.println("enter the AcNumber for withdrawal");
                      AccountN=sc.nextInt();
                      System.out.println("Enter the withdrawal Ammount");
                      Ammount=sc.nextInt();
                      for(int i=0;i<B.length;i++) 
                      {
                            if(B[i].getAccountN()==AccountN)
                            {
                               if(B[i].getAccountB()<Ammount)
                              {
                                 System.out.println("your account Balance is less the ammount");
                                 System.out.println("total is  = "+B[i].getAccountB());
                              }
                               else
                              {
                                  B[i].setAccountB(B[i].getAccountB()-Ammount);
                                  System.out.println("Ammount is withdrawal you can see");
                                  System.out.println("total is  = "+B[i].getAccountB());
                               }
                            }   
                            if(B[i].getAccountN()!=AccountN) 
                            {
                                System.out.println("wrong ac number");
                            }
                      }
                      System.out.println("===============================================================");
                      break;
            case 3:
                      System.out.println("enter the AcNumber for withdrawal");
                      AccountN=sc.nextInt();
                      System.out.println("see your acccount Balance");
                      for(int i=0;i<B.length;i++)
                      {
                         if(B[i].getAccountN()==AccountN)
                         {
                             System.out.println("total is  = "+B[i].getAccountB());
                         }
                          if(B[i].getAccountN()!=AccountN)
                         {
                             System.out.println("wrong ac number");
                         }
                      }
                      System.out.println("===============================================================");
                      break;
            default:
                     System.out.println("wrong choice");
       }
       //System.out.println("enter 1 for use");
       //r=sc.nextInt();
       }while(true);
     }
}   











      