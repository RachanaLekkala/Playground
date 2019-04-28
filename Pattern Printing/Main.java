import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int c=sc.nextInt();
      int row=r;
      int col=c;
      for(int i=0;i<r;i++)
      {
          int x=row-i;
         for(int j=row;j>x;j--)
          {
            System.out.print(j);
          }
        for(int j=x;j>0;j--)
        {
          System.out.print(x);
        }
       System.out.println();
      }
      }
    }
