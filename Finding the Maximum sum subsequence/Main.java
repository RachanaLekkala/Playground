import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int start=0;
    int end,i;
    int max=0;
    for(i=0;i<n-1;i++)
    {
      if(arr[i]>arr[i+1])
      {
        end=i;
        int sum=0;
        for(int j=start;j<=end;j++)
        {
          sum=arr[j]+sum;
        }
        if(sum>max)
          max=sum;
        start=i+1;
      }
    }
    if(i==(n-1))
    {
      int sum=0;
      for(int j=start;j<n;j++)
        sum=sum+arr[j];
      if(max<sum)
        max=sum;
    }
    if(i!=(n-1))
    {
      int sum=0;
      for(int j=start;j<n;j++)
        sum=sum+arr[j];
      if(max<sum)
        max=sum;
    }
    System.out.println(max);
  }
}