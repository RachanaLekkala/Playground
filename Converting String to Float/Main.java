import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    float res=new Float(str);
    System.out.printf("%.4f",res);
    System.out.print("00");
  }
}