import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    String sub=sc.nextLine();
    int count=0;
    int l1=str.length();
    int l2=sub.length();
    int index=0;
    while(index!=-1)
    {
      index=str.indexOf(sub,index);
      if(index!=-1)
      {
        count++;
        index+=1;
      }
    }
    System.out.println(count);
  } 
}