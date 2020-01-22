import java.util.Scanner;
class Matmul
{
   int n;
    Matmul(int a)
    {
     n=a;  
    }
   int ar[][]=new int[10][10];
   int br[][]=new int[10][10];
   int cr[][]=new int[10][10];
   void out()
   {
     Scanner s= new Scanner(System.in);
     for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
           {
             ar[i][j]=s.nextInt();
           }
       }
      for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
           {
             br[i][j]=s.nextInt();
           }
       }
      for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
           {
             for(int k=0;k<n;k++)
             cr[i][j]+=ar[i][k]*br[k][j];
           }
       }
       for(int i=0;i<n;i++)
       {
         for(int j=0;j<n;j++)
           {
             System.out.print(cr[i][j] + " ");
           }
         System.out.print("\n");
       }
    }
}
class Arraymul
{
  public static void main(String args[])
  {
    
     Scanner o=new Scanner(System.in);
     int a;
     a=o.nextInt();
      Matmul m = new Matmul(a);
     m.out();
  }
}