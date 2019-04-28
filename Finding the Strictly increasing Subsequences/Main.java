import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    int l=arr[n-1];
    for(int j=0;j<n;j++)
    {
      for(int k=j+1;k<n;k++)
      {
        if((arr[j]<arr[k])&&((l-arr[k])!=4))
          System.out.println(arr[j]+","+arr[k]); 
      }
    }
  }
}