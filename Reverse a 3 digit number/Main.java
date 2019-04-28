import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f=n%10;
    n=n/10;
    int s=n%10;
    int l=n/10;
    int r=f*100+s*10+l;
    System.out.println(r);
  }
}