import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int flag=0;
      int i=0;
      while(i<n/2)
      {
        if(arr[i]!=arr[n-1-i])
          flag=1;
        i++;
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}