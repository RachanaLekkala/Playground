import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int flag=1;
    if(n<0)
    {
      flag=0;
      n=(-1)*n;
    }
    String str="";
    while(n>0)
    {
      int r=n%10;
      n=n/10;
      char ch=(char)(r+'0');
      str=ch+str;
      if((n<=0)&&(flag==0))
        str='-'+str;
    }
    System.out.println(str);
  }
}