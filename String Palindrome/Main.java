import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      String str1="";
      int n=str.length();
      for(int i=n-1;i>=0;i--)
      {
        str1=str1+str.charAt(i);
      }
      if(str.equals(str1))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}