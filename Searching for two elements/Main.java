import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner (System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int ra=-1;
      int rb=-1;
      int fa=0;
      int fb=0;
      for(int i=0;i<n;i++)
      {
        if(a==arr[i])
        {
          fa=1;
          ra=i;
        }
        if(b==arr[i])
        {
          fb=1;
          rb=i;
        }
      }
      if(fa==1)
        System.out.println(ra);
      else
        System.out.println("-1");
      if(fb==1)
        System.out.println(rb);
      else
        System.out.println("-1");
    }
}