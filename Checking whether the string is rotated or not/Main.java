import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc = new Scanner (System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int flag=0;
      if(str1.length()!=str2.length())
        flag=1;
      if(flag==0)
      {
        String str=str1+str1;
        if(str.contains(str2))
          flag=0;
        else
          flag=1;
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No"); 
    }
}