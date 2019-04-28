import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int r=sc.nextInt();
    for(int i=0;i<r;i++)
    {
      int temp;
      if(n%2==0)
      {
        temp=arr[n-2];
        for(int j=(n-2);j>=2;j=j-2)
          arr[j]=arr[j-2];
        arr[0]=temp;
        temp=arr[1];
        for(int j=1;j<n-2;j=j+2)
          arr[j]=arr[j+2];
        arr[n-1]=temp;
      }
      else
      {
        temp=arr[n-1];
        for(int j=(n-1);j>=2;j=j-2)
          arr[j]=arr[j-2];
        arr[0]=temp;
        temp=arr[1];
        for(int j=1;j<n-2;j=j+2)
          arr[j]=arr[j+2];
        arr[n-2]=temp;
      }
      
    }
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+" ");
  	}
}