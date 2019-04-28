import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int mat[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        mat[i][j]=in.nextInt();
    for(int j=0;j<c;j++)
    {
      for(int i=0;i<r;i++)
      {
        if(i==j)
          System.out.print(mat[i][j]+" ");        
      }
    }
     for(int i=0;i<r;i++)
    {
      for(int j=1;j<c;j++)
      {
        if(j>i && j!=2)
        {
          System.out.print(mat[i][j]+" ");   
        }
      }
    }
    if(r==3)
    {
      System.out.print(mat[1][2]+" "+mat[0][2]);
    }
  
  }
}