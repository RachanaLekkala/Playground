import java.util.Scanner;
class Main
{
  public static void reversew(String str){
    //your code here;
    String[] words=str.split(" ");
    String reverse="";
    for(int i=0;i<words.length;i++)
    {
      String word=words[i];
      String reversew="";
      for(int j=word.length()-1;j>=0;j--)
      {
        reverse=reverse+word.charAt(j);
      }
      reverse=reverse+reversew+" ";
    }
    System.out.println(reverse);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    reversew(str);
  }
}