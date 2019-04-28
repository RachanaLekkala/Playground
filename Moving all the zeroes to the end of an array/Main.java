import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int res[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int c=0;
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
          c++;
        else
        {
          res[j]=arr[i];
          j++;
        }
      }
      for(int i=j;i<n;i++)
        res[i]=0;
      for(int i=0;i<n;i++)
        System.out.print(res[i]+" ");
    }
}