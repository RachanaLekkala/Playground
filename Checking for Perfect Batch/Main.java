import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int res=arr[0]+arr[1]+arr[2];
    int flag=0;
    for(int i=3;i<n;i=i+3)
    {
      int sum=0;
      sum=arr[i]+arr[i+1]+arr[i+2];
      if(sum!=res)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}