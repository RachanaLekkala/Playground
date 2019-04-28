import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str= sc.nextLine();
      int stat[]=new int[26];
      for(int i=0;i<26;i++)
        stat[i]=0;
     int n=str.length();
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
      for(int i=0;i<26;i++)
      {
        if(stat[i]==0)
        {
          char ch=(char)(i+'a');
          System.out.print(ch+" ");
        }
      }
    }
}