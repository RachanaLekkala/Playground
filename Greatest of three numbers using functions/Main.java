import java.util.Scanner;
class Main{
  public static int grt(int a,int b)
  {
    if(a>b)
      return a;
    else
      return b;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n1= sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int c=grt(n1,n2);
      System.out.println(grt(c,n3));
	}
}