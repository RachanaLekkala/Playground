import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
       Scanner sc=new Scanner(System.in);
      char c=sc.next().charAt(0);
      int k=sc.nextInt();
      char res;
      if((c>='a')&&(c<='z'))
      {
        int q=c-'a';
        q=q-k;
        if(q<0)
          q=q+26;
        res=(char)(q+'a');
      }
      else
      {
        int q=c-'A';
        q=q-k;
        if(q<0)
          q=q+26;
        res=(char)(q+'A');
      }
      System.out.println(res);
    
    }
}