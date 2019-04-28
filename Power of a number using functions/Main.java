import java.util.Scanner;
class Main{
  public static int pow(int n,int x)
  {
    int r=1;
    for(int i=1;i<=x;i++)
      r=r*n;
    return r;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n=sc.nextInt();
      int x=sc.nextInt();
      int res=pow(n,x);
      System.out.println(res);
	}
}