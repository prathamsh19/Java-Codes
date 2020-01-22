import java.util.Scanner;
class Pratham2D
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int p,q,n,k,b=0,c=0,h=0;
 n=s.nextInt();
 k=s.nextInt();
 int a[][]=new int[n][k];
 for(int i=0;i<n;i++)
 {
 for(int j=0;j<k;j++)
 a[i][j]=s.nextInt();
 }
 for(int i=0;i<n;i++) 
 {
  for(int j=0;j<k;j++)
  {
  if(a[i][j]>h)
  h=a[i][j];
  }
 }
 p=h;
 q=h;
  for(int i=0;i<n;i++) 
 {
  for(int j=0;j<k;j++)
  {
  if(a[i][j]<p)
  {
  p=a[i][j];
  b=i;
  c=j;
  }
  }
 }
 a[b][c]=h;
  for(int i=0;i<n;i++) 
 {
  for(int j=0;j<k;j++)
  {
  if(a[i][j]<q)
  q=a[i][j];
  }
 }
 System.out.println(p);
 System.out.println(q);
}
}