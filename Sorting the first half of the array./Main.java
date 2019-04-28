import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int l=n/2;
    for(int i=0;i<l;i++)
    {
      for(int j=i+1;j<l;j++)
      {
        if(arr[i]>arr[j]){
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
      }
    }
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
      
  }
}