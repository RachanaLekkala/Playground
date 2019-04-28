import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc= new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int res=1;
      for(int i=0;i<e;i++)
      {
        res=res*b;
      }
      System.out.println(res);
    }
}