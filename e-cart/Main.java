//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
  //implement your logic to calculate total price
  public Bill(int p,int q)
  {
    System.out.println("Total Price is : "+(p*q));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int p=sc.nextInt();
    int q=sc.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill(p,q);
    
    //write the logic here
  }
}