import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      for(int i=0;i<n-1;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(arr[i]>arr[j])
          {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
      }
      int j=1;
      for(int i=0;i<n;i++)
      {
        if(arr[i]!=j)
        {
          System.out.println(j);
          break;
        }
        j++;
      }
    }
}