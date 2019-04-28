import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    return n*n;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc = new Scanner (System.in);
      int t=sc.nextInt();
      int res=square(t);
      System.out.println(res);
	} 
}