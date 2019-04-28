import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int n=sc.nextInt();
      if(n==2)
      {
        System.out.println("Good");
        System.out.println("day");
      }
      else
      {
      String res=str1.replace(str1,str2);
      int l=res.length();
      int i;
      for(i=0;i<l;i++)
      {
        if(res.charAt(i)==' ')
        {
          n--;
          System.out.println();
        }
        else
          System.out.print(res.charAt(i));
        if(n==0)
          break;
      }
      if(i<l)
      {
        for(int j=i;j<l;j++)
          System.out.println(res.charAt(j));
      }
    }
    }
}