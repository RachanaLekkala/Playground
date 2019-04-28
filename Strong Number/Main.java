import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int res=n;
      int sum=0;
      while(n>0)
      {
        int j=n%10;
        int r=1;
        for(int i=1;i<=j;i++)
           r=r*i;
        sum=sum+r;
        n=n/10;
      }
      if(res==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}