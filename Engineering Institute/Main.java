//import required packages
import java.util.Scanner;
class Faculty
{
  int sal;
  public void salary()
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
 int s;

  public void salary()
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(s+3000));
  }
}
class IT extends Faculty
{
int s1;


  public void salary()
  {
    //write your IT class statements
    
    System.out.println("IT Faculty: "+(s1+5000));
  }
}
class ECE extends Faculty
{
int s2;

  public void salary()
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(s2+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty f=new Faculty();
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    f.sal=x;
    f.salary();
    CSE obj1=new CSE();
    obj1.s=x;
    obj1.salary();
    IT obj2=new IT();
    obj2.s1=x;
    obj2.salary();
    ECE obj3 = new ECE();
    obj3.s2=x;
    obj3.salary();
    
    //implement your required concept here
  }
}