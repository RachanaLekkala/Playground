import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int s=sc.nextInt();
      switch(s)
      {
        case 1:int side=sc.nextInt();
          System.out.println(side*side);
          break;
        case 2:int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(l*b);
          break;
        case 3:int bs=sc.nextInt();
          int h=sc.nextInt();
          System.out.println(bs*h/2);
          break;
        case 4:int r=sc.nextInt();
          double p=3.14;
          System.out.println(p*r*r);
          break;
      }
    }
}