import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int max=0;
      int count=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==1)
          count++;
        else
        {
          if(max<count)
          {
            max=count;
            count=0;
          }
        }
      }
      System.out.println(max);
    }
}