import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc= new Scanner(System.in);
      String str=sc.nextLine();
      /*StringBuilder sb=new StringBuilder(str);
      int n=sb.length();
      reverse_string(sb,0,n);*/
      String[] split=str.split(" ");
      String result="";
      for(int i=split.length-1;i>=0;i--)
      {
        result+=(split[i]+" ");
      }
      System.out.println(result.trim());
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      StringBuilder str=new StringBuilder("");
      StringBuilder temp=new StringBuilder("");
      for(int i=0;i<end_idx-1;i++)
      {
        if(str.charAt(i)==' ')
        {
          temp.append(str);
          temp.setLength(0);
        }
        else
        {
          temp.append(str.charAt(i));
        }
        
      }
      System.out.println(str);
    }
}