import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner (System.in);
      String str=sc.nextLine();
      int stat[]=new int[26];
      int n=str.length();
      for(int i=0;i<26;i++)
        stat[i]=0;
      for(int i=0;i<n;i++)
      {
        char ch=str.charAt(i);
        if((ch>='a')&&(ch<='z'))
        {
          int offset=ch-'a';
          stat[offset]++;
        }
        if((ch>='A')&&(ch<='Z'))
        {
          int offset=ch-'A';
          stat[offset]++;
        }
      }
      for(int i=0;i<n;i++)
      {
        char ch=str.charAt(i);
        if((ch>='a')&&(ch<='z'))
        {
          int idx=ch-'a';
          if(stat[idx]!=0)
          {
            System.out.print(ch);
            System.out.print(stat[idx]+" ");
            stat[idx]=0;
          }
        }
        else
        {
          int idx=ch-'A';
          char c=(char)('a'+idx);
          if(stat[idx]!=0)
          {
            System.out.print(c);
            System.out.print(stat[idx]+" ");
            stat[idx]=0;
          }
        }
      }
    }
}