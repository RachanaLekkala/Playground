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
    int max=0;
    int res=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        res=i;
      }
    }
    System.out.println(res);
  }
}