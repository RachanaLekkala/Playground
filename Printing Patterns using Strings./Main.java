import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int l = str.length();
    int m=l/2;
    for(int i=l-1;i>=0;i--)
    {
      int count=0;
      for(int j=0;j<i;j++)
      {
        System.out.print(" ");
      count++;
      }
      if(i>=l/2)
      {
        int s=l/2;
        while(count<l)
        {
          System.out.print(str.charAt(s++));
          count++;
        }
      }
      else
      {
        int s=l/2;
        while(count<=(l/2+i))
        {
          System.out.print(str.charAt(s++));
          count++;
        }
        s=0;
        while(count<l)
        {
          System.out.print(str.charAt(s++));
          count++;
        }
      }
      System.out.println();
    }
  }
}
  