import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int k=n;
      int res=n;
      int c=0;
      while(k>0)
      {
        k=k/10;
        c++;
      }
      int sum=0;
      while(n>0)
      {
        int j=n%10;
        int i=1;
        for(int a=1;a<=c;a++)
          i=i*j;
        sum=sum+i;
        n=n/10;
      }
      if(res==sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}