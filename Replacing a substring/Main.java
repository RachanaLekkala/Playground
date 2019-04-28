import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      String sub=sc.nextLine();
      String rep=sc.nextLine();
      String res=str.replaceAll(sub,rep);
      System.out.println(res);
    }
}