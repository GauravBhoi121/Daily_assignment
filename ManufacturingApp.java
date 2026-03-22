import java.util.*;
/* 
Q2. Problem Statement: 
Create a Java application to manage product batches for a manufacturing company. Each batch contains 
multiple products. You must implement the following: 
 
   Requirements: 
1. POJO Class: 
Create a Product class with the following fields: 
o productId (int) 
o productName (String) 
o unitPrice (double) 
o quantity (int) 
o batchId (int) 
Include a parameterized constructor, getter & setter methods, and a method double totalPrice() 
that returns the total price (unitPrice * quantity).  */
class Product extends set
{
     private int id;
     private String name;
     private double unitPrice;
     private int quntity;
     private int batchId;
     
    Product(int id,String name,int quantity, int batchId)
    {
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.quntity=quantity;
        this.batchId=batchId;
    }
    Product(){}
    public int getId()
    {
       return id;
    }
    public String getName()
    {
       return name;
    }
    public double getunitPrice()
    {
        return unitPrice;
    }
    public int getBatchId()
    {
          return batchId;
    } 
    public int getQuntity()
    {
        return quntity;
    }
    public String toString()
    {
         return "ID "+id+" NAME "+name+" UNTIPRICE "+unitPrice+" QUNTITY "+quntity+" batchId "+batchId;
    } 
}
class set
{
}
class ManufacturingApp
{
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          
          set s = new Product(1, "abc", 20, 101);
               set s2 =  new Product(2, "abc", 20, 101);

          System.out.println(s +""+s2);
      }
}