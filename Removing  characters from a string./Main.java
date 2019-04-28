import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		String sub_str = sc.nextLine(); 
    for(int i=0;i<str.length();i++)
    {
      int match=0;
      for(int j=0;j<sub_str.length();j++)
      {
        if(str.charAt(i)==sub_str.charAt(j))
        {
          match=1;
        }
      }
      if(match==0)
        System.out.print(str.charAt(i));
    }
    
	} 
}