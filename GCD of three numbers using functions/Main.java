import java.util.Scanner;
public class Main{
  public static int gcd(int a,int b)
  {
    int min;
    int g=1;
    if(a<b)
      min=a;
    else
      min=b;
    while(min>0)
    {
      if((a%min==0)&&(b%min==0))
      {
        g=min;
        break;
      }
      min--;
    }
    return g;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n1= sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int c=gcd(n1,n2);
      System.out.println(gcd(c,n3));
	}
}