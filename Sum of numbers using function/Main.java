import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int r=n*(n+1)/2;
    return r;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int res=sum(n);
      System.out.println(res);
	}
}