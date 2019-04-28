import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      n=n/10;
      int r=n%10;
      System.out.println(r);
	}
}